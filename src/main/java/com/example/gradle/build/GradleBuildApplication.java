package com.example.gradle.build;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GradleBuildApplication {


    public static void main(String[] args) {
        final ApplicationContext app = SpringApplication.run(GradleBuildApplication.class, args);

        System.out.println("888888888888888 -    " + app.getEnvironment().getProperty("name") + "     - 888888888888888");

    }
}
