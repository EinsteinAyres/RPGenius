package com.qu4rx.RPGenius;

import org.springframework.boot.SpringApplication;

public class TestRpGeniusApplication {

	public static void main(String[] args) {
		SpringApplication.from(RpGeniusApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
