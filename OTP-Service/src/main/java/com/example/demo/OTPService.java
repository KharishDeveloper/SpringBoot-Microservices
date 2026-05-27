package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class OTPService {

	@Autowired
	private JavaMailSender jms;

	private String generatedOTP;

	public String generateOTP() {
		Random rm = new Random();
		int otp = 100000 + rm.nextInt(900000);
		generatedOTP = String.valueOf(otp);
		return generatedOTP;
	}

	public void sendOTP(String toEmail) {
		String otp = generateOTP();
		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setTo(toEmail);
		smm.setSubject("Your authorization code for Registration");
		smm.setText("hi, \n Your code is : " + otp + "\n thanks for registration");
		
		jms.send(smm);
	}

	public boolean validateOTP(String userotp) {
		return userotp.equals(generatedOTP);
	}

}
