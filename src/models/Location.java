package models;

public class Location {
    private int index;
    private int[] roomLocations;
    private int background;
    private roomObj[] roomObjects;
    private int[][] objXY;

    public Location(int index,int[] roomLocations,int background, roomObj[] roomObjects, int[][] objXY) {
        this.index = index;
        this.roomLocations = roomLocations;
        this.background = background;
        this.roomObjects = roomObjects;
        this.objXY = objXY;

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

    public roomObj[] getRoomObjects() {
        return roomObjects;
    }

    public int[][] getObjXY() {
        return objXY;
    }
}
