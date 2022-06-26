package com.main;

import com.bean.Vehicle;
import com.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class container {
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehcile in bean class:"+veh.getName());
        veh.print();

    }
}
