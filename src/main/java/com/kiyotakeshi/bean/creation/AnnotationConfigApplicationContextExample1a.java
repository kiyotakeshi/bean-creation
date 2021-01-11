package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.ConfigurationComponentScan;
import com.kiyotakeshi.bean.creation.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextExample1a {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ConfigurationComponentScan.class);
        var bean1 = context.getBean(Bean1.class);

        bean1.sayHello();
    }
}
