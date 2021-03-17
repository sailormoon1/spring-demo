package com.example.springdemo.wytest.demowytest.config;


import com.example.springdemo.wytest.demowytest.test.ExcOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2021/3/3 5:34 下午
 * @description 类描述
 */
@Configuration
@PropertySource(value= "classpath:/package/test.properties",encoding = "utf-8")
@Slf4j
public class Test {
    //使用方式一（@PropertySource +Environment）
    @Autowired
    Environment env;
    @Autowired
    ApplicationContext applicationContext;

    @Value("${disc.title}")
//    @Value("disc.title")  //这种方式不管用-必须得带${}
    private String discTitle;
    @Value("${disc.artist}")
//    @Value("disc.artist")
    private String discArtist;
    @Bean
    public ExcOrder build(){
        log.info("使用方式一（@PropertySource +Environment）配置文件中的参数为：{}",env.getProperty("disc.title"));
        log.info("使用方式二（@PropertySource +@Value ）配置文件中的参数为：{}",discTitle);
        ExcOrder excOrder = new ExcOrder(env.getProperty("disc.title"),env.getProperty("disc.artist"));

//        applicationContext.getEnvironment().getActiveProfiles()[0];

        applicationContext.getEnvironment().getActiveProfiles();
        return excOrder;
    }

}
