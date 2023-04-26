package org.example.uc;

import org.example.uc.vga.VGA;
import org.example.uc.usb.USB;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UC {

     private VGA vga;
     private USB usb;


    public UC(@Qualifier("Adapter") VGA vga,
              @Qualifier("Mouse") USB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    public int readData(){
        return usb.read();
    }

    public void printData(String data){
        vga.print(data);
    }
}
