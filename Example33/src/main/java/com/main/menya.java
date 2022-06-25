package com.main;

import com.bean.Benish;
import com.pojo.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class menya {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Benish.class);
        Vehicle vehicle=context.getBean("audi",Vehicle.class);
        Vehicle vehicle1=context.getBean("Borelo",Vehicle.class);
        Vehicle vehicle2=context.getBean("ferrari",Vehicle.class);
        System.out.println("vehicle name--->" + vehicle.getName());
        System.out.println("vehicle1 name--->" + vehicle1.getName());
        System.out.println("vehicle2 name--->" + vehicle2.getName());
    }
}
