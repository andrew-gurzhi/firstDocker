package com.example.firstDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstDockerApplication.class, args);
    }

    @Bean(initMethod = "init")
    public Stub initTestData() {
        return new Stub();
    }
}
