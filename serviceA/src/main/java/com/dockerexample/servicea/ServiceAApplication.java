package com.dockerexample.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class ServiceAApplication {

	@GetMapping("/message")
	public void getMessage(){
		System.out.println("Welcome to coding....");
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}
