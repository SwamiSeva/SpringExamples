package com.bean;

import com.pojo.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Benish {
    @Bean(name="audi")
    Vehicle vehicle1(){
        Vehicle veh1=new Vehicle();
        veh1.setName("Audi");
        return veh1;
    }

    @Bean(value ="Borelo")
    Vehicle vehicle2(){
        Vehicle veh2=new Vehicle();
        veh2.setName("Bolero");
        return veh2;
    }
    @Primary //primary annotation will select the ferrari as default bean
    @Bean("ferrari")
    Vehicle vehicle3(){
        Vehicle veh3=new Vehicle();
        veh3.setName("Ferrari");
        return veh3;
    }
}
