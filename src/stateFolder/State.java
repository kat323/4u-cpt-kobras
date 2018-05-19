package stateFolder;

import game.StateManger;

import java.awt.Graphics2D;

public abstract class State {
    protected StateManger sm;

    public State(StateManger sm) {
        this.sm = sm;
    }

    public abstract void init();

    public abstract void draw(Graphics2D g);

    public abstract void update();

}
