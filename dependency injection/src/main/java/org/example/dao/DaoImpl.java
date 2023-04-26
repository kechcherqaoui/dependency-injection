package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository("db")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        return 34;
    }
}
