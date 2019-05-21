package com.wei;

import com.wei.configuration.Config;
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
import org.springframework.core.env.Environment;



/**
 * @author user
 */
@ComponentScan(basePackages = {"com"})
@MapperScan(basePackages = {"com.wei.dao"})
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private Environment environment;
    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("abc");

        };
    }

    @Test
    public void showConfig() {
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        //查看主配置中的配置
//        String property = context.getEnvironment().getProperty("spring.datasource.driver-class-name");
//        System.out.println(property);

        Config config = context.getBean(Config.class);

    }

}

