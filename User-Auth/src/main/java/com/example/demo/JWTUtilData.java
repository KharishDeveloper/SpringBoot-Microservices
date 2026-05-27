package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JWTUtilData {

	public static final String secret = "myasecretbkeycmydsecretrkeyjbvergirbgkeriurborioghriugrekjbgirbzmyxkeyrfbrbrb";

	private static final SecretKey keydata = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));

	public static String GenerateToken(String uname) {
		System.out.println(secret.length());
		String compact = Jwts.builder().setSubject(uname).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10))
				.signWith(keydata, SignatureAlgorithm.HS256).compact();
		System.out.println("generated token is : " + compact);
		String string = secret.getBytes().toString();
		System.out.println(string);
		return compact;
	}

	public static String validateToken(String token) {
		String subject = Jwts.parserBuilder().setSigningKey(secret.getBytes()).build().parseClaimsJws(token).getBody()
				.getSubject();
		System.out.println("validated token is :" + subject);
		return subject;
	}
}
