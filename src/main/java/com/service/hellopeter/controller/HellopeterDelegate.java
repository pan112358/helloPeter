package com.service.hellopeter.controller;

import org.springframework.stereotype.Component;


@Component
public class HellopeterDelegate implements Hellopeter {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
