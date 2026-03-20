package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "config-service")
@Component
public class ConfigDetails {

	public String username;

	public String passWord;

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public ConfigDetails(String userName, String passWord) {
		super();
		this.username = userName;
		this.passWord = passWord;
	}

	public ConfigDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ConfigDetails [userName=" + username + ", passWord=" + passWord + "]";
	}

}
