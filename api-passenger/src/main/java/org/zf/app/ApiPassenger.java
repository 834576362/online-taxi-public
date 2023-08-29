package org.zf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiPassenger {
    public static void main(String[] args) {
        SpringApplication.run(ApiPassenger.class,args);
        System.out.println("ApiPassenger-Hello World");
    }
}
