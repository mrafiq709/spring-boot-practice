package com.rafiq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@GetMapping("/")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
