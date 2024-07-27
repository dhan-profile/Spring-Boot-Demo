package com.example.SpringDemoApp.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HelloService
{
    public List<String> listUsers()
    {
    	List<String> s=new ArrayList<String>();
    	             s.add("java");
    	             s.add("python");
    	             s.add("dot-net");
    	             s.add("mysql");
    	  return s;
    }
}
