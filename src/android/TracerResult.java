package cordova.plugin.networktracer;

import com.qiniu.android.netdiag.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TracerResult implements Output {
  public  String[] responses = {};
  @Override
  public void write(String line) {
    responses = add(responses, line);
  }

  private static String[] add(String[] arr, String element){
    List<String> list = new ArrayList<>(Arrays.asList(arr));
    list.add(element);
    return list.toArray(new String[0]);
  }
}
