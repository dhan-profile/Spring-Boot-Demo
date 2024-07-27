package com.example.SpringDemoApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnotherController {

    @RequestMapping(value="/another", method=RequestMethod.GET)
    @ResponseBody
    public String anotherMethod() {
        return "This is another method!";
    }
}
