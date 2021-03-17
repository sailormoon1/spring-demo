package com.example.springdemo.wytest.demowytest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2021/3/4 10:34 上午
 * @description 类描述
 */
@Configuration
@PropertySource(value = "classpath:/package/test.properties")
public class BasicPropertyWithJavaConfig {
    public BasicPropertyWithJavaConfig() {
        super();
    }
}
