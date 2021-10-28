package com.palla.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/home")
	public String Home() {
		return "welcome BCITS" ;
	}

}
