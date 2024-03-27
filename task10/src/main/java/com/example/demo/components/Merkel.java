package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component("Merkel")
public class Merkel implements Politician{
    @Override
    public void doPolitic() {
        System.out.println("Merkel do politics");
    }
}
