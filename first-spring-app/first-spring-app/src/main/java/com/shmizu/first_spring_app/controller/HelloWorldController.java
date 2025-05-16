package com.shmizu.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATELESS -> a cada nova requisição eu recebo todas as informações que eu preciso para fazer aquela funcionalidade que o cliente pediu/ pode ser utilizado um token no lugar de login e senha
// STATEFULL -> o estade de cada cliente é mantido no servidor
// @Controller
// @ResponseBody
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head
    // GET /hello-world

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }
}
