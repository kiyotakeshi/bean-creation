package com.kiyotakeshi.bean.creation;

import com.kiyotakeshi.bean.creation.beans.Bean1;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextExample {
    public static void main(String[] args) {
        String beansXmlLocationOnFilesystem = FileSystemXmlApplicationContextExample.class.getResource("/beans.xml").toExternalForm();

        var context = new FileSystemXmlApplicationContext(beansXmlLocationOnFilesystem);

        var bean1 = context.getBean(Bean1.class);

        bean1.sayHello();
    }
}
