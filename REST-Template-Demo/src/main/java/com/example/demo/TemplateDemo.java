package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class TemplateDemo {
	@Autowired
	RestTemplate rt;

	@GetMapping("/receive-data")
	public String getRT() {
		String forObject = rt.getForObject("http://CONFIG-CLIENT/client/all-users", String.class);
		return forObject;
	}
}
