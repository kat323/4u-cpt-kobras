package models;

import helpers.Content;

public class Location {
    private int index;
    private int[] roomLocations;
    private ImgObj background;
    private ImgObj[] imgObjects;

    public Location(int index, int[] roomLocations, int background, ImgObj[] imgObjects) {
        this.index = index;
        this.roomLocations = roomLocations;
        this.background = Content.images.get(background);
        this.imgObjects = imgObjects;

    }
    public int getIndex() {
        return index;
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
