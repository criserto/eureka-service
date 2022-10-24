package com.reto.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RetoConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetoConfigServiceApplication.class, args);
    }

}
