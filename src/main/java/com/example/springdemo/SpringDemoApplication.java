package com.example.springdemo;

import com.example.springdemo.wytest.demowytest.test.PropertyResourceImportTest;
import com.example.springdemo.wytest.demowytest.util.ApplicationContextUtil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringDemoApplication.class, args);
        String[] strArray = configurableApplicationContext.getBeanDefinitionNames();
        List<String> strList = Arrays.asList(strArray);
        strList.stream().forEach(item->System.out.println("bean名为："+item));
        PropertyResourceImportTest propertyResourceImportTest= new PropertyResourceImportTest();
        ApplicationContextUtil.setEnvironment(configurableApplicationContext.getEnvironment());
    }

}
