package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	protected static Logger logger=LoggerFactory.getLogger("HelloController");

	@RequestMapping("/")
	public String helloworld(){
		
		logger.debug("访问主页");
		return "Hello world!";
	}
	
	@RequestMapping("/hello/{name}")
	public String hellName(@PathVariable String name){
		return "Hello "+name;
	}
	
	@RequestMapping("/hello2/{name}")
	public String hellName2(@PathVariable String name){
		return "Hello "+name;
	}
	
	@RequestMapping("/getnumber/{startNumber}")
	public int getnumber(@PathVariable int startNumber) {
		return startNumber;
	}
}
