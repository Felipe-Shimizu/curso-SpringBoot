package com.shmizu.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @ são anotações
@SpringBootApplication
// @Configuration -> vai definir que a classe pode ter métodos que definem beans
// @EnableAutoConfiguration -> vai ativar a auto configuração do Spring
// @ComponentScan -> vai permitir que o Spring escaneie todo o pacote do projeto

public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
