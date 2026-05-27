package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

	@Autowired
	OpenFeignINter feign;
	
	@Autowired
	Environment env;
	
	@GetMapping("/feign-client")
	public Object getusersDemo() {
//		String port = env.getProperty("local.server.port");
		return feign.getUsers();
		
	}
}
