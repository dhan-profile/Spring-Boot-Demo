package com.example.SpringDemoApp.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@RestController
//===============
// @RestController eliminates the need for an additional @ResponseBody annotation on each method.
@RequestMapping("/api")
//=======================
// @RequestMapping used at class level making "/api" as a common Pre-End-point for all methods
// End-points under this mapping is accessed as ==> /api/hello   (OR)  ==> /api/users
public class ApiController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
//    @ResponseBody
    public String sayHello() {
        return "Hello from API!";
    }

    @RequestMapping(value="/users", method=RequestMethod.GET)
//    @ResponseBody
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("David");

        return users;
    }
}

