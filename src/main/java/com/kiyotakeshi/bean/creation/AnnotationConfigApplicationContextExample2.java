package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("com.kiyotakeshi.bean.creation.beans");

        var bean1 = context.getBean(Bean1.class);

        bean1.sayHello();
    }
}
