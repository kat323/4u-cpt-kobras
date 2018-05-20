package models;

import java.awt.*;

public class Location {
    private int index;
    private int[] roomLocations;
    private Image backGround;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int[] getRoomLocations() {
        return roomLocations;
    }

    public void setRoomLocations(int[] roomLocations) {
        this.roomLocations = roomLocations;
    }

    public Image getBackGround() {
        return backGround;
    }

    public void setBackGround(Image backGround) {
        this.backGround = backGround;
    }
}
