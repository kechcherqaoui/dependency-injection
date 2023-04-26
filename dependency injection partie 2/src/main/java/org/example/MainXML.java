package org.example;

import org.example.uc.UC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        System.out.println("XML Version");
        ApplicationContext springContext =
              new ClassPathXmlApplicationContext("config.xml");
        UC uc = springContext.getBean(UC.class);
        uc.printData("Hello world!");
        System.out.println(uc.readData());
    }
}
