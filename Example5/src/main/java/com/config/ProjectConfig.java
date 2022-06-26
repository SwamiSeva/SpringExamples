package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //it tells the spring that this is bean class
@ComponentScan(basePackages = "com.bean") //it tells spring that go and and search bean class in respective package
public class ProjectConfig {
}
