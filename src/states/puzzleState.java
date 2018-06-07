package states;

import game.StateManager;

import java.awt.*;

public class puzzleState extends State{
    private int id;
    public puzzleState(StateManager sm, int id) {
        super(sm);
        this.id = id;
    }

    @Override
    public void init() {

    }

    @Override
    public void draw(Graphics2D g) {
        // pass draw to the instance of the puzzle
    }

    @Override
    public void update() {
        // passes update to the puzzle class
        // check if puzzle is completed then change state to location
    }

    @Override
    public void handleInput() {

    }
}
