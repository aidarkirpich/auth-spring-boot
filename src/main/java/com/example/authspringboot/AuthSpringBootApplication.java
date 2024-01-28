package com.example.authspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import web.dao.UserDaoImpl;

@SpringBootApplication
@ComponentScan(basePackages="web")
@Import(UserDaoImpl.class)
public class AuthSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthSpringBootApplication.class, args);
    }

}
