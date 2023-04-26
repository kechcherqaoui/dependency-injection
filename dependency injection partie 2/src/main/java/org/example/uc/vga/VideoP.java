package org.example.uc.vga;

import org.springframework.stereotype.Repository;

@Repository("projector")
public class VideoP implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Video projecteur");
        System.out.println(message);
    }
}
