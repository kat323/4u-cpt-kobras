package models;

public class Location {
    private int index;
    private int[] roomLocations;
    private int background;
    private int[] entities;

    public Location(int index,int[] roomLocations,int background, int[] entities) {
        this.background = background;
        this.entities = entities;

    }
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

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
