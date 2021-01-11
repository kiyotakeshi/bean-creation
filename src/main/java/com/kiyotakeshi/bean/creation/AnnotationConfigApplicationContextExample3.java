package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.kiyotakeshi.bean.creation.beans");
        context.refresh();

        Bean1 bean = context.getBean(Bean1.class);

        bean.sayHello();
    }
}
