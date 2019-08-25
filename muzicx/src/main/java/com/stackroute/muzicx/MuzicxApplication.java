package com.stackroute.muzicx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MuzicxApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzicxApplication.class, args);
	}

}
