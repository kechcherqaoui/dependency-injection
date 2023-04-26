package org.example;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main3XML {
    public static void main(String[] args) {
        System.out.println("Spring Version XML");
        ApplicationContext springContext =
              new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) springContext.getBean("metier");
        System.out.println("Result = " + metier.calculate());
    }
}
