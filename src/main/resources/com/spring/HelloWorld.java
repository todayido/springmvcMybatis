package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorld {

	@RequestMapping("hello")
	public String hello(){
		return "index";
	}
	
	public void text(){
	}
	
}
