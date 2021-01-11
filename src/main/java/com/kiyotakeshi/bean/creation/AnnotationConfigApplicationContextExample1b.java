package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import com.kiyotakeshi.bean.creation.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample1b {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var bean1 = context.getBean(Bean1.class);

        bean1.sayHello();
    }
}
