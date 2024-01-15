package com.neviton.javacotacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavacotacaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavacotacaoApplication.class, args);
    }

    /* @Bean
    public CommandLineRunner run(CotacaoDolarService cotacaoDolarService) {
        return args -> {

        };
    } */
}