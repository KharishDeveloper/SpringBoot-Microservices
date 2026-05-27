package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

	private final AIService ais;

	public AIController(AIService aiservice) {
		this.ais = aiservice;
	}

	@GetMapping("/ask")
	public String ask(@RequestParam("ques") String prompt) {
		System.out.println("question : "+prompt);
		return ais.AskAI(prompt);
	}
}
