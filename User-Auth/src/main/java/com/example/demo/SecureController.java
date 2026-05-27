package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@GetMapping("/secured")
	public String securedController(@RequestParam("authentication") String authentication) {

		return "Hello" + authentication + " Secured API Call.";
	}
}
