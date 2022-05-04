package com.spring.sl4jlogger.Apptest;


import com.spring.sl4jlogger.controller.LoggingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class Tester {

    @Autowired
    private LoggingController log;

    @Test
    public  void test(){
        System.out.println("test");
    }
}

