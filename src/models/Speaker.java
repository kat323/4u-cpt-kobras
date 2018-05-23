package models;

import helpers.Content;

public class Speaker {
    private String text;
    private String name;
    private ImgObj image;

    public Speaker(String text, ImgObj image,String name) {
        this.text = text;
        this.image = image;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public ImgObj getImage() {
        return image;
    }
}
