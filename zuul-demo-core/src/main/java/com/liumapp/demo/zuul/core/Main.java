package com.liumapp.demo.zuul.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liumapp on 2/6/18 10:43 AM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableZuulProxy
@SpringBootApplication(scanBasePackages = {"com.liumapp.demo.zuul.core"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class , args);
    }

}
