package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "com")
@RequestMapping("/client")
public class ConfigController {

	@Autowired
	ConfigDetails cd;
	
	@Autowired
	Repos rp;
	
	@Autowired
	Environment env;
	
	@GetMapping("/getDetails")
	public String getdetails() {
		return cd.getUserName()+" "+cd.getPassWord();
	}
	
	@GetMapping("/all-users")
	public String getUSers(){
		String property = env.getProperty("local.server.port");
		List<UserDemo> all = rp.findAll();
		return all+property;
	}
	
}
