package com.crud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.crud.user"})
public class UsersCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersCrudServiceApplication.class, args);
	}

}
