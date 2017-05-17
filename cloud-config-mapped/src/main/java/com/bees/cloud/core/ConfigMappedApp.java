package com.bees.cloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigMappedApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigMappedApp.class, args);
	}
}
