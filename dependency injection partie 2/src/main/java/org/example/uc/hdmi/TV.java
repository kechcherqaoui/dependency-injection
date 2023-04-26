package org.example.uc.hdmi;

import org.springframework.stereotype.Repository;

@Repository
public class TV implements HDMI{

    @Override
    public void print(byte[] data) {
        System.out.println("TV");
        System.out.println(new String(data));
    }
}
