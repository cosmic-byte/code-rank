package com.coderank.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.social.SocialWebAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class CodeRankApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeRankApplication.class, args);
	}
}
