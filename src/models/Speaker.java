package models;

import helpers.Content;

public class Speaker {
    private String text;
    private ImgObj image;
    public Speaker(String text, int image) {
        this.text = text;
        this.image = Content.images.get(image);
    }

    public String getText() {
        return text;
    }

    public ImgObj getImage() {
        return image;
    }
}
