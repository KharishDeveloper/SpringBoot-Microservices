package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class LoadConfig {

	@Bean
	@LoadBalanced
	public WebClient.Builder getWC() {
		return WebClient.builder();
	}
}
