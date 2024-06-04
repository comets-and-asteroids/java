package com.example.Pract12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


public class App implements CommandLineRunner {
	private static FileHasher fileHasher;
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("START running...");
		SpringApplication.run(App.class, args);
		System.out.println("end");
	}

	@Override
	public void run(String... args) throws Exception {}
}

