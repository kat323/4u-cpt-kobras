package stateFolder;

import game.StateManager;

import java.awt.Graphics2D;

public abstract class State {
    protected StateManager sm;

    public State(StateManager sm) {
        this.sm = sm;
    }

    public abstract void init();

    public abstract void draw(Graphics2D g);

    public abstract void update();

    public abstract void handleInput();

}
