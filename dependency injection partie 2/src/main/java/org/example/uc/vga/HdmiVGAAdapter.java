package org.example.uc.vga;

import org.example.uc.hdmi.HDMI;
import org.springframework.stereotype.Repository;

@Repository("Adapter")
public class HdmiVGAAdapter implements VGA {
    private HDMI hdmi;

    public HdmiVGAAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        System.out.println("HdmiVGAAdapter");
        byte[] data = message.getBytes();
        hdmi.print(data);
    }

}
