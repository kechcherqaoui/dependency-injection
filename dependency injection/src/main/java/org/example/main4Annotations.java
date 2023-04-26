package org.example;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main4Annotations {
    public static void main(String[] args) {
        System.out.println("Spring version annotations");
        ApplicationContext context = new AnnotationConfigApplicationContext(
              "org.example.dao",
              "org.example.metier"
        );
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result = " + metier.calculate());
    }
}
