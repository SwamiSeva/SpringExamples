package com.mainclass;

import com.config.ProjectConfig;
import com.pojo.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCConfig {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
     Vehicle kia= context.getBean(Vehicle.class);
        System.out.println("Vehilce name from sprinng context"
                + kia.getName());

        String sathya=context.getBean(String.class);
        System.out.println("returned String"+sathya);

        Integer integer=context.getBean(Integer.class);
        System.out.println("returned Integer"+integer);

    }

}
