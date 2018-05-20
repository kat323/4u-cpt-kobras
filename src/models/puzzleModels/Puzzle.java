package models.puzzleModels;

import java.awt.Graphics2D;

public abstract class Puzzle {
    private boolean isCompleted;
    private int id;
    private int score;
    private int total;



    public abstract void draw(Graphics2D g);

    public abstract boolean passed();

    public abstract boolean failed();

    public abstract boolean quit();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getID() {
        return id;
    }
}
