package com.main;

import com.bean.Benish;
import com.pojo.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class menya {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Benish.class);
        Vehicle vehicle=context.getBean(Vehicle.class);

        System.out.println("Default vehicle name--->" + vehicle.getName());

    }
}
