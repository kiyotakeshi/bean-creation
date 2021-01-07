package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.SpringBean1;
import com.kiyotakeshi.bean.creation.configuration.ConfigurationStatic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample1b {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationStatic.class
        );

        SpringBean1 bean = context.getBean(SpringBean1.class);

        bean.sayHello();
    }
}
