package me.bezgerts.pechkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class PechkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(PechkinApplication.class, args);
    }
}
