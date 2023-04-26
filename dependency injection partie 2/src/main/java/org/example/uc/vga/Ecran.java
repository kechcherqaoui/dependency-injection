package org.example.uc.vga;

import org.springframework.stereotype.Repository;

@Repository("Screen")
public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Ecran");
        System.out.println(message);
    }
}
