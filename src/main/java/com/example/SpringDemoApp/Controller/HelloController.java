package com.example.SpringDemoApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.SpringDemoApp.Service.HelloService;


@Controller
public class HelloController
{
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody
    public String add()
    {
    	return "HelloWorld";
    }
	
//	@RequestMapping maps the "/hello" End-point to the "add()" method defined under it 
	
	@RequestMapping(value="/listOfUsers",method=RequestMethod.GET)
	@ResponseBody
	public List<String> listOfUsers()
	{
		return helloService.listUsers();
	}
}
