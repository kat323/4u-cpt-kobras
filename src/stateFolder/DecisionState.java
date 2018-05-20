package stateFolder;

import game.StateManager;

import java.awt.*;

public class DecisionState extends State {
    public static final int PUZZLE = 1;
    public static final int DIALOGUE = 2;
    protected static final int GRADE = 3;
    protected static final int MARK = 4;
    protected static final int SOCIAL = 5;

    public DecisionState(StateManager sm) {
        super(sm);
    }

    @Override
    public void init() {

    }

    @Override
    public void draw(Graphics2D g) {

    }

    @Override
    public void update() {

    }

    @Override
    public void handleInput() {

    }
}
