package models.puzzleModels;

import java.awt.Graphics2D;

public abstract class Puzzle {
    private boolean isCompleted;
    private int score;
    private int total;

    public abstract void draw(Graphics2D g);

    public abstract boolean passed();

    public abstract boolean failed();

    public abstract boolean quit();
}
