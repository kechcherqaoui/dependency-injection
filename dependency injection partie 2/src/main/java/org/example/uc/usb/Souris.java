package org.example.uc.usb;

import org.springframework.stereotype.Repository;

@Repository("Mouse")
public class Souris implements USB {

    @Override
    public int read() {
        System.out.println("Souris");
        return 50;
    }
}
