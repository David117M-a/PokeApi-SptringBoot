package com.example.Pokedex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class PokedexApplication {
	public static void main(String[] args) {
		SpringApplication.run(PokedexApplication.class, args);
	}
}
