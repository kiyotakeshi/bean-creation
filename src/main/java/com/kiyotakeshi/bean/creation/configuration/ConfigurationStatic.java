package com.kiyotakeshi.bean.creation.configuration;

import com.kiyotakeshi.bean.creation.beans.SpringBean1;
import com.kiyotakeshi.bean.creation.beans.SpringBean2;
import com.kiyotakeshi.bean.creation.beans.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationStatic {
    @Bean
    public SpringBean1 getSpringBean1() {
        return new SpringBean1();
    }

    @Bean
    public SpringBean2 getSpringBean2() {
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 getSpringBean3() {
        return new SpringBean3();
    }
}
