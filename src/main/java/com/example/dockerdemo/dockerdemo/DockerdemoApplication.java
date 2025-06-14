package com.example.dockerdemo.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
		System.out.println("running");
	}

	@GetMapping("/api/greet")
	public String greet() {
		return "Welcome to my Dockerized Spring Boot App!";
	}

	@GetMapping("/api/thriver")
	public String thrive() {
		return "Dear Pavan, no matter how long it takes, keep going. Someone will notice. Your time will come.";
	}

}
