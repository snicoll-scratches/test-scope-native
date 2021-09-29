package com.example.testscope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Stephane Nicoll
 */
@RestController
public class HelloController {

	private final HelloMessage helloMessage;

	public HelloController(HelloMessage helloMessage) {
		this.helloMessage = helloMessage;
	}

	@GetMapping("/{name}")
	public String get(@PathVariable String name) {
		System.out.println("Previous value " +this.helloMessage.getMessage());
		this.helloMessage.setMessage("Hello " + name);
		return this.helloMessage.getMessage();

	}
}
