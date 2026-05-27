package com.example.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {

	private final ChatClient cc;

	public AIService(ChatClient.Builder builder) {
		this.cc = builder.build();
	}

	public String AskAI(String propmpt) {
		String response = cc.prompt(propmpt).call().content();
		System.out.println("response : "+response);
		return response;
	}
}
