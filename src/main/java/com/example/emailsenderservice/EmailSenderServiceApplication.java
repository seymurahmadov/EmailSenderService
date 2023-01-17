package com.example.emailsenderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmailSenderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailSenderServiceApplication.class, args);
    }

}
