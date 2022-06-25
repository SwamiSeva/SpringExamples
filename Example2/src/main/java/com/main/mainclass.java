package com.main;

import com.config.beanclass;
import com.pojo.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class mainclass {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(beanclass.class);
        Vehicle vehicle=context.getBean("vehicle1",Vehicle.class);
        Vehicle vehicle1=context.getBean("vehicle2",Vehicle.class);
        Vehicle vehicle2=context.getBean("vehicle3",Vehicle.class);
        System.out.println("vehicle name--->" + vehicle.getName());
        System.out.println("vehicle1 name--->" + vehicle1.getName());
        System.out.println("vehicle2 name--->" + vehicle2.getName());
    }

}
