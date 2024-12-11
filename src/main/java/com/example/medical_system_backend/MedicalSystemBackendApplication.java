package com.example.medical_system_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:5173")
public class MedicalSystemBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalSystemBackendApplication.class, args);
	}

}
