package models;

import helpers.Content;

public class Location {
    private int id;
    private int[] roomLocations;
    private ImgObj background;
    private ImgObj[] imgObjects;

    public Location(int id, int[] roomLocations, int background, ImgObj[] imgObjects) {
        this.id = id;
        this.roomLocations = roomLocations;
        this.background = Content.images.get(background);
        this.imgObjects = imgObjects;

    }
    public int getId() {
        return id;
    }

    public int[] getRoomLocations() {
        return roomLocations;
    }

    public ImgObj getBackground() {
        return background;
    }

    public ImgObj[] getImgObjects() {
        return imgObjects;
    }

}
