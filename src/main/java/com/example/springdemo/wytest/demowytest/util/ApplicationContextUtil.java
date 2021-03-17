package com.example.springdemo.wytest.demowytest.util;


import org.springframework.core.env.Environment;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2021/3/4 11:24 上午
 * @description 类描述
 */
public class ApplicationContextUtil {
    private static   Environment environment;
    public static void setEnvironment(Environment environment){
        ApplicationContextUtil.environment= environment;
    }
    public static Environment getEnvironment(){
        return ApplicationContextUtil.environment;
    }
}
