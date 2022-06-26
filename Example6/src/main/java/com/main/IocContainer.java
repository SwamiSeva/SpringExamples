package com.main;

import com.bean.Vehicle;
import com.config.PrjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocContainer {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrjConfig.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println("initialize() vehicle name--->" + vehicle.getName());

    }
}
