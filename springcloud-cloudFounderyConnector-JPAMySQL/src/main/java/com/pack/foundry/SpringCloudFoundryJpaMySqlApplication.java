package com.pack.foundry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("cloud")
public class SpringCloudFoundryJpaMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundryJpaMySqlApplication.class, args);
	}
}
