package models;

import game.Content;

import java.awt.image.BufferedImage;

public class roomObj {
    int x;
    int y;
    int height;
    int width;
    BufferedImage img;

    public roomObj(int x, int y, int height, int width, int img) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.img = Content.images.get(img);
    }
}
