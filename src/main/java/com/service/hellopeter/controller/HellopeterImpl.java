package com.service.hellopeter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-24T06:05:11.879Z")

@RpcSchema(schemaId = "hellopeter")
public class HellopeterImpl implements Hellopeter{

    @Autowired
    private HellopeterDelegate hellopeterDelegate;


    public String helloworld(String name) {

        return hellopeterDelegate.helloworld(name);
    }

}
