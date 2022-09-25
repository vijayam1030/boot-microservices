package com.microserviceexample.cloudgateway;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    public String userServiceFallBackMethod(){
        return "user service is taking more time, please try again later";
    }

    public String departmentServiceFallBackMethod(){
        return "Dept service is taking more time, please try again later";
    }


}
