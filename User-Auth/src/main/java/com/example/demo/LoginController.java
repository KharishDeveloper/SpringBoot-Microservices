package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

//    private final JwtDecoder jwtDecoder;

//    LoginController(JwtDecoder jwtDecoder) {
//        this.jwtDecoder = jwtDecoder;
//    }

	@PostMapping("/perform")
	public String Login(@RequestParam String username, @RequestParam String password) {
		if ("user".equals(username) && "passcode".equals(password)) {
			return JWTUtilData.GenerateToken(username);
		}
		return "invalid";
	}

	@GetMapping("/secured")
	public String securedController(@RequestParam("authentication") String authentication) {
		System.out.println(JWTUtilData.validateToken(authentication));
		return "Hello"+ authentication +" Secured API Call.";
	}
}
