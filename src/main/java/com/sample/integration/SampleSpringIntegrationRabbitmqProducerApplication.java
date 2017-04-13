package com.sample.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@IntegrationComponentScan
public class SampleSpringIntegrationRabbitmqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringIntegrationRabbitmqProducerApplication.class, args);
	}
}
