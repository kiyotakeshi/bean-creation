package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.kiyotakeshi.bean.creation.beans");
        context.refresh();

        SpringBean1 bean = context.getBean(SpringBean1.class);

        bean.sayHello();
    }
}
