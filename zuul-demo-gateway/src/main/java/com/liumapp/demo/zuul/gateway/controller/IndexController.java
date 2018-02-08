package com.liumapp.demo.zuul.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 2/8/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("")
public class IndexController {

    @RequestMapping("/hello")
    public String index () {
        return "hello , this is zuul demo";
    }

}
