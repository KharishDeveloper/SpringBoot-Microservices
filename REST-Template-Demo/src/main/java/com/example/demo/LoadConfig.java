package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadConfig {

	@Bean
	@LoadBalanced
	RestTemplate getRT() {
		return new RestTemplate();
	}
}
