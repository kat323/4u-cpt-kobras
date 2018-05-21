package states;

import game.StateManager;

import java.awt.*;

public class DecisionState extends State {


    public DecisionState(StateManager sm, int id) {
        super(sm);
    }

    @Override
    public void init() {
        // get decision from id
    }

    @Override
    public void draw(Graphics2D g) {
        // draw a translucent thing to darken the screen
        // draw the strings from the choices on 2 sides maybe in a box


    }

    @Override
    public void update() {
        handleInput();
    }

    @Override
    public void handleInput() {
        // if clicked on one option then check the effects of that option (0 is left, 1 is right) for each choice
        /*
            if(effect == DIALOGUE) // check the decision class for other final constants
            // sm.setState(dialogue

         */
    }
}
