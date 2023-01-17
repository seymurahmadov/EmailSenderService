package com.example.emailsenderservice.util;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailSch {

    private final JavaMailSender javaMailSender;

    @Scheduled(fixedRate = 5000)
    public void main(){
        System.out.println("Already Email Sent ");
        String text = "Matrix";
        String to = "s.axmedov99@gmail.com";
        String subject = "Matrix subject";

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("abbtaskify@yahoo.com");

        simpleMailMessage.setTo(to);
        simpleMailMessage.setText(text);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);
    }
}
