package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextExample {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/beans.xml");
        var bean1 = context.getBean(Bean1.class);

        bean1.sayHello();
    }
}
