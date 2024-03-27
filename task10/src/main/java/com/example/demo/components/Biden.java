package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component("Biden")
public class Biden implements Politician{
    @Override
    public void doPolitic() {
        System.out.println("Biden do politics");
    }
}
