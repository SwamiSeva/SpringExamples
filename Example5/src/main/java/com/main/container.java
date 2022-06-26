package com.main;

import com.bean.Vehicle;
import com.config.PrjConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class container {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrjConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle in bean class:"+veh.getName());


    }
}
