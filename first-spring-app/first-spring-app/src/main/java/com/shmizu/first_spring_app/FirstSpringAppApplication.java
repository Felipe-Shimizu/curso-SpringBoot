package com.shmizu.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

// @ são anotações
@SpringBootApplication
// @Configuration -> vai definir que a classe pode ter métodos que definem bins
// @EnableAutoConfiguration -> vai ativar a auto configuração do Spring
// @ComponentScan -> vai permitir que o Spring escaneie todo o pacote do projeto
@Profile("dev")
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}
