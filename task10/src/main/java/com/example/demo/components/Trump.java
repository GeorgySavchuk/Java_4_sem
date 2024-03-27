package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component("Trump")
public class Trump implements Politician{
    @Override
    public void doPolitic() {
        System.out.println("Trump do politics");
    }
}
