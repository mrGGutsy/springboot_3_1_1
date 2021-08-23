package ru.mrgutsy.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.mrgutsy.spring_boot")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
