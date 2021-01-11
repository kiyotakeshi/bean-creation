package com.kiyotakeshi.bean.creation.configuration;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import com.kiyotakeshi.bean.creation.beans.Bean2;
import com.kiyotakeshi.bean.creation.beans.Bean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Bean1 getBean1() {
        return new Bean1();
    }

    @Bean
    public Bean2 getBean2() {
        return new Bean2();
    }

    @Bean
    public Bean3 getBean3() {
        return new Bean3();
    }
}
