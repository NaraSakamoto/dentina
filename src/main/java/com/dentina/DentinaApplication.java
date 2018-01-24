package com.dentina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.dentina.domain")
@EnableJpaRepositories("com.dentina.repository")
public class DentinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentinaApplication.class, args);
	}
	
}
