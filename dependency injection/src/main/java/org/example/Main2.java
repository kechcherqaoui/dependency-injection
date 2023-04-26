package org.example;

import org.example.dao.IDao;
import org.example.metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        System.out.println("instanciation dynamique");

        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class metierClass = Class.forName(metierClassName);
        IMetier metier = (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);

        Method setDao = metierClass.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);

        System.out.println("Result = " + metier.calculate());
    }
}
