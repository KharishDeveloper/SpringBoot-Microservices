package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Config-client")
public interface OpenFeignINter {

	@GetMapping("/client/all-users")
	String getUsers();
}
