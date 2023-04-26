package org.example;

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("instanciation statique");
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);

        System.out.println("Result = " + metier.calculate());
    }
}