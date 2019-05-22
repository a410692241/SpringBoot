package com.wei;

import com.wei.bo.User;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * @Description:
 * @Author: Awake-Hu
 * @Date: 2019/5/22 11:02
 */
@Component
public class Demo2Application extends SpringBootServletInitializer {
    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("abc");

        };
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
        //查看主配置中的配置
//        String property = context.getEnvironment().getProperty("spring.datasource.driver-class-name");
//        System.out.println(property);

        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean(TestBean.class));
    }

}

