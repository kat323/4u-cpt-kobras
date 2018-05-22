package states;

import game.StateManager;
import helpers.Content;
import helpers.Drawer;
import models.ImgObj;

import java.awt.*;

/**
 * displays the current room as well as possible directions
 * Allows the user to click on arrows to move, or interact with surroundings
 */
public class LocationState extends State {
    private static ImgObj[] arrows = {Content.images.get(1),Content.images.get(2), Content.images.get(3), Content.images.get(4)};
    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;

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
        for(ImgObj a: arrows) {
            Drawer.draw(g,a);
        }
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
