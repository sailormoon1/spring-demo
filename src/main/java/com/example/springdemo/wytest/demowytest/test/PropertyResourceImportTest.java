package com.example.springdemo.wytest.demowytest.test;


import com.example.springdemo.wytest.demowytest.config.BasicPropertyWithJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2021/3/4 10:37 上午
 * @description 类描述
 */
@Import(BasicPropertyWithJavaConfig.class)
@Slf4j
public class PropertyResourceImportTest implements EnvironmentAware {
    private Environment env;
    @Value("${disc.artist}")
    private String discArtist;

    public PropertyResourceImportTest() {
//        log.info("2使用方式三 @Resource + @Import +env+@Value 读取到的值分别为：{},{}", ApplicationContextUtil.getEnvironment().getProperty("disc.artist"),discArtist);
    }

    /**
     * 目前这个方法不好使，还没有整明白
     * @param environment
     */
    @Override
    public void setEnvironment(Environment environment) {
        log.info("使用方式三 @Resource + @Import +env+@Value 读取到的值分别为：{},{}", environment.getProperty("disc.artist"),discArtist);
        env= environment;
    }
}
