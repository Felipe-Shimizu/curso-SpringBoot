package com.shmizu.first_spring_app.controller;

import com.shmizu.first_spring_app.domain.User;
import com.shmizu.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// STATELESS -> a cada nova requisição eu recebo todas as informações que eu preciso para fazer aquela funcionalidade que o cliente pediu/ pode ser utilizado um token no lugar de login e senha
// STATEFULL -> o estade de cada cliente é mantido no servidor
// @Controller
// @ResponseBody
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head
    // GET /hello-world

    //outra forma de injetar a dependencia abaixo
    @Autowired
    private HelloWorldService helloWorldService;

    //para injetar a dependencia em private acima
    //public HelloWorldController(HelloWorldService helloWorldService) {
    //    this.helloWorldService = helloWorldService;
    //}

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Shimizu");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World Post" + body.getName();
    }
}
