package com.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct // this annotation will allow spring to execute below method after initialization bean has finished
    public void initialize()
    {
        this.name="HondaCity";
    }
}
