package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-06 22:44
 **/
@ImportResource( value = "dubbo.xml")
@SpringBootApplication
public class AppProvider {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider.class);
    }
}
