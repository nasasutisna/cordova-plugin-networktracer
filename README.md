"# cordova-plugin-networktracer" 

  If you using ionic, declare variable cordova on above the class,<br />
  example <br /> 
  declare var cordova <br />
  export class MyApp <br />
  
 ## trace route
 cordova.plugins.NetworkTracer.traceRoute("www.google.com", function (response) { <br />
    // result <br />
    // {ip:... , data: []} <br />
    console.log(response); <br />
 }, function (error) { <br />
    console.log(error); <br />
 });
 
 ## ping route
 cordova.plugins.NetworkTracer.ping("www.google.com", function (response) { <br />
    console.log(response); <br />
 }, function (error) { <br />
    console.log(error); <br />
 });
