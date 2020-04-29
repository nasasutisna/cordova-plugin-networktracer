"# cordova-plugin-networktracer" 

Example :
  
  If you using ionic, declare variable cordova on above the class,
  exp :
  declare var cordova;
  export class MyApp{}
  
 # trace route
 cordova.plugins.NetworkTracer.traceRoute("www.google.com", function (response) {
    // result 
    // {ip:... , data: []}
    console.log(response);
 }, function (error) {
    console.log(error);
 });
 
 # ping route
 cordova.plugins.NetworkTracer.ping("www.google.com", function (response) {
    console.log(response);
 }, function (error) {
    console.log(error);
 });
