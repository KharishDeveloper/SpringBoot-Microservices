package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otp")
public class OTPController {

	@Autowired
	private OTPService otpservice;

	@PostMapping("/send")
	public String sendCode(@RequestParam("email") String mail) {
		otpservice.sendOTP(mail);
		return "OTP sent successfully. Kindly check";
	}

	@GetMapping("/verify")
	public String Verify(@RequestParam("OTP") String otp) {
		if (otpservice.validateOTP(otp)) {
			return "VERIFIED";
		} else {
			return "invalid";
		}
	}
}
