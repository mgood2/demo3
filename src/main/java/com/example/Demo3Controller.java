package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3Controller {
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}