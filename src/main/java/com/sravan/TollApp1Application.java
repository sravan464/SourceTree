package com.sravan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TollApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(TollApp1Application.class, args);
	}
	
	@RequestMapping(value="/greet")
	public String greeting(){
		
		return "hello from app1";
	}
}
