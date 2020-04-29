package cordova.plugin.networktracer;

import com.qiniu.android.netdiag.Ping;
import com.qiniu.android.netdiag.TraceRoute;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

/**
 * This class echoes a string called from JavaScript.
 */
public class NetworkTracer extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("traceRoute")) {
			String address = args.getString(0);
			this.traceRoute(address, callbackContext);
			return true;
		} else if (action.equals("ping")) {
			String address = args.getString(0);
			this.pingRoute(address, callbackContext);
			return true;
		}

		return false;
	}

	private void traceRoute(String address, CallbackContext callbackContext) {
		TracerResult traceResponse = new TracerResult();
		JSONObject obj = new JSONObject();

		TraceRoute.start(address, traceResponse, new TraceRoute.Callback() {
			@Override
			public void complete(TraceRoute.Result result) {
				JSONArray resultTrace = new JSONArray(Arrays.asList(traceResponse.responses));

				try {
					obj.put("ip", result.ip);
					obj.put("data", resultTrace);
				} catch (JSONException e) {
					e.printStackTrace();
				}

				callbackContext.success(obj);
			}
		});
	}

	private void pingRoute(String address, CallbackContext callbackContext) {
		Ping.start(address, 60, new TracerResult(), new Ping.Callback() {
			@Override
			public void complete(Ping.Result r) {
				callbackContext.success(r.result);
			}
		});
	}
}
