package com.cg.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppSpringApplication.class, args);
		log.info("Address Book App Started!");
	}

}
