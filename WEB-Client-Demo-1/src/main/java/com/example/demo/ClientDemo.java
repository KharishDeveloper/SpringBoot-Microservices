package com.example.demo;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/web")
public class ClientDemo {
	

	@GetMapping("/get-users-block") // synchronous call if use .block();
	public String GetdataFromOtherService() {
		WebClient wc = WebClient.create();
		String bodyToMono = wc.get().uri("http://localhost:8812/client/all-users").retrieve().bodyToMono(String.class)
				.block(Duration.ofMinutes(1));// specify the max time for waiting the controller if receive early don't
												// wait.
		return bodyToMono;
	}

	@GetMapping("/get-users") // synchronous call if use .block();
	public String GetdataFromOtherService1() {
		WebClient wc=WebClient.create();
		String bodyToMono = wc.get().uri("http://localhost:8812/client/all-users").retrieve().bodyToMono(String.class)
				.block(Duration.ofSeconds(1500000));
		return bodyToMono;
	}
}
