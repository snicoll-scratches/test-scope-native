package com.example.testscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
public class TestScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestScopeApplication.class, args);
	}

	@RequestScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Bean
	public HelloMessage helloMessage() {
		return new HelloMessage();
	}

}
