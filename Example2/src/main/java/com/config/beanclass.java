package com.config;

import com.pojo.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beanclass {

    @Bean
    Vehicle vehicle1(){
        Vehicle vehicle1=new Vehicle();
        vehicle1.setName("Audi");
        return vehicle1;
    }

    @Bean
    Vehicle vehicle2(){
        Vehicle vehicle2=new Vehicle();
        vehicle2.setName("Bolero");
        return vehicle2;
    }
    @Bean
    Vehicle vehicle3(){
        Vehicle vehicle3=new Vehicle();
        vehicle3.setName("Ferrari");
        return vehicle3;
    }
}
