package org.example.uc.usb;

import org.springframework.stereotype.Repository;

@Repository("Keyboard")
public class Clavier implements USB {

    @Override
    public int read() {
        System.out.println("Clavie");
        return 100;
    }

}
