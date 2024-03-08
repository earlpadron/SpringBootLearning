package dev.earlpadron.learning.freeCodeCamp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    /**
     * @ResponseStatus(<StatusCode>) at the method level will change the heaaders with the specific Status Code that is provided
     * @RequestBody converts the request body from a client into a java object specified by the type from the controller
     * @PathVariable(<value>) Annotation which indicates that a method parameter should be bound to a URI template variable.
     * @RequestParam(<value>) Annotation which indicates that a method parameter should be bound to a web request parameter/query parameter.
     */

//    @GetMapping(value = "/")
//    @ResponseStatus(HttpStatus.OK)
//    public String sayHello(){
//        return "hello";
//    }


    @PostMapping(value = "/post-order")
    public String post(
            @RequestBody Order order
    ){
        return "Request accepted : " + order.toString() ;
    }
    @PostMapping(value = "/post-order-record")
    public String postRecord(
            @RequestBody OrderRecord order
    ){
        return "Request accepted : " + order.toString() ;
    }

    @GetMapping(value = "/hello/{user-name}")
    public String pathVariable(@PathVariable(value = "user-name") String username ){
       return "my value = " + username;
    }

    //http://localhost/8080/hello?user-name=<value>&user-lastname=<value>
    @GetMapping(value = "/hello")
    public String paramVar(
            @RequestParam(value = "user-name") String username,
            @RequestParam(value = "user-lastname") String userLastName){
       return "my value = " + username + " " + userLastName;
    }


}
