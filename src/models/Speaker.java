package models;

import helpers.Content;

public class Speaker {
    private String text;

    public String getName() {
        return name;
    }

    private String name;
    private ImgObj image;
    public Speaker(String text, int image,String name) {
        this.text = text;
        this.image = Content.images.get(image);
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public ImgObj getImage() {
        return image;
    }
}
