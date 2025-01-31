package com.sansarch.bookstore_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookstoreDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreDiscoveryServerApplication.class, args);
	}

}
