package org.example;

import org.example.uc.UC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        System.out.println("Annotations version");
        ApplicationContext springContext =
              new AnnotationConfigApplicationContext("org.example");
        UC uc = springContext.getBean(UC.class);
        uc.printData("Hello world!");
        System.out.println(uc.readData());
    }
}