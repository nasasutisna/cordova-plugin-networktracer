### Support OS
Android <br /> <br />
  If you using ionic, declare variable cordova on above the class,<br />
  example &nbsp;: <br /> 
  <br /> 
 &nbsp;&nbsp; declare var cordova <br />
 &nbsp;&nbsp; export class MyApp{} <br />
  
 ## trace route
 cordova.plugins.NetworkTracer.traceRoute("www.google.com", function (response) { <br />
  &nbsp;  console.log(response); <br />
 }, function (error) { <br />
  &nbsp;  console.log(error); <br />
 });
 
 ## ping route
 cordova.plugins.NetworkTracer.ping("www.google.com", function (response) { <br />
   &nbsp; console.log(response); <br />
 }, function (error) { <br />
   &nbsp;  console.log(error); <br />
 });
