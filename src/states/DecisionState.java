package states;

import game.StateManager;
import helpers.Content;
import models.Decision;

import java.awt.*;

public class DecisionState extends State {
    String[] choices = new String[2];
    private static final int RIGHT = 0;
    private static final int LEFT = 1;
    private static Decision decision;
    private static int choice;

    public DecisionState(StateManager sm, int id) {
        super(sm);
        decision = Content.decisions.get(id);
    }

    @Override
    public void init() {

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
        // if clicked on one option then check the effects of that option (0 is right, 1 is left) for each choice
        // if(Mouose.isClicked())
        // if mouse collides with(0,0,400,400) {
        // choice = LEFT;
        // }
        // if mouse collides with(400,0,400,400) {
        // choice = RIGHT;
        // }
        // int effect = getEffect(choice)
        /*
            if(effect == DIALOGUE) // check the decision class for other final constants
            // sm.setState(StateManager.DIALOGUE, decision.getDialogue(choice)
            if(effect == PUZZLE)
                sm.setState(StateManager.PUZZLE, decision.getPuzzle())

            if grade
                Player.grade(

            sm.setState(StateManager.DIALOGUE, decision.getDialogue(choice)
         */
    }
}
