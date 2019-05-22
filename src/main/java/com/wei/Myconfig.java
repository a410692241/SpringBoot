package com.wei;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Myconfig {
    @Bean
    public List getList() {
        return new ArrayList<>();
    }

}
