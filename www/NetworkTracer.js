var exec = require('cordova/exec');

exports.traceRoute = function (arg0, success, error) {
    exec(success, error, 'NetworkTracer', 'traceRoute', [arg0]);
};

exports.ping = function (arg0, success, error) {
    exec(success, error, 'NetworkTracer', 'ping', [arg0]);
};
