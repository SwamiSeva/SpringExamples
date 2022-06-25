package com.config;

import com.pojo.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("BMW");
        return  vehicle;
    }

    @Bean
    public String say(){
        return "welcome to spring";
    }

    @Bean
    Integer salary()
    {
        return 180;
    }
}
