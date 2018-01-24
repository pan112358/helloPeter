package com.service.hellopeter.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHellopeter {

    HellopeterDelegate hellopeterDelegate = new HellopeterDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = hellopeterDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
