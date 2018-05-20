package models;

import java.awt.image.BufferedImage;

public class Speaker {
    private String text;
    private BufferedImage image;
    public Speaker(String text, BufferedImage image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public BufferedImage getImage() {
        return image;
    }
}
