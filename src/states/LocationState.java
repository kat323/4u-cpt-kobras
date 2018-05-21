package states;

import game.StateManager;

import java.awt.*;

/**
 * displays the current room as well as possible directions
 * Allows the user to click on arrows to move, or interact with surroundings
 */
public class LocationState extends State {
    private int[] directions;


    public LocationState(StateManager sm) {
        super(sm);
    }

    @Override
    public void init() {
        directions = new int[4];
        for(int i = 0; i < 4; i++) {

        }
    }

    @Override
    public void draw(Graphics2D g) {
        // draw background

        // draw north

        // draw east

        // draw south

        // draw west

        // draw room object at specified objxy
    }

    @Override
    public void update() {
        handleInput();
    }

    @Override
    public void handleInput() {

        // if mouse collides with north or

        // if mouse collides with east or

        // if mouse collides with south or

        // if mouse collides with west or

        // if mouse collides with entity spot start dialogue

    }
}
