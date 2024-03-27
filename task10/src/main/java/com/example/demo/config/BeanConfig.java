package com.example.demo.config;

import com.example.demo.components.Biden;
import com.example.demo.components.Merkel;
import com.example.demo.components.Trump;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Trump trump() {
        return new Trump();
    }
    @Bean
    public Biden biden() {
        return new Biden();
    }
    @Bean
    public Merkel merkel() {
        return new Merkel();
    }
}
