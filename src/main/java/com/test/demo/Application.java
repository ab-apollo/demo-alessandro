package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.test.demo.entity")
@EntityScan("com.test.demo.entity")
public class Application {

    public static void main(String[] args) {

        System.out.println("Hello Antonio--> Hai visto? ");
        SpringApplication.run(Application.class, args);
        System.out.println("Ciao Ale");
    }
}
//1005139b-912e-408c-a174-ee0e266aa2ba




