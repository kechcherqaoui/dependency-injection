package org.example.metier;


import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class MetierImpl implements IMetier {


    private IDao dao;

    public MetierImpl(@Qualifier("db") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        return dao.getData() * 12.5;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
