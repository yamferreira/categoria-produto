package com.example.categoria_produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CategoriaProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriaProdutoApplication.class, args);
	}

}
