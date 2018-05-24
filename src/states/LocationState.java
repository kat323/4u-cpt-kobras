package states;

import game.StateManager;
import helpers.Content;
import helpers.Drawer;
import helpers.Mouse;
import models.ImgObj;
import models.Location;

import java.awt.*;
import java.util.Timer;

import static game.StateManager.DIALOGUE;


/**
 * displays the current room as well as possible directions
 * Allows the user to click on arrows to move, or interact with surroundings
 */
public class LocationState extends State {

    private static ImgObj[] arrows = {Content.images.get(101),Content.images.get(102), Content.images.get(103), Content.images.get(104)};
    private static Location location = Content.locations.get(0);


    public LocationState(StateManager sm) {
        super(sm);
    }

    @Override
    public void init() {

    }

    @Override
    public void draw(Graphics2D g) {

        // draw background
        Drawer.draw(g,location.getBackground());
        for(ImgObj a: arrows) {
            Drawer.draw(g,a);
        }

        // draw room object
        Drawer.draw(g, location.getDialogue().getObj());
    }

    @Override
    public void update() {
        handleInput();
    }

    @Override
    public void handleInput() {
        // if mouse clicked arrow button

        if(Mouse.isClicked()) {
            for (int i = 0; i < 4; i++) {
                if(Mouse.isCollided(arrows[i])) {
                    int move = location.getDirection(i);
                    if(move != -1) {

                        location = Content.locations.get(move);
                        Mouse.setClickState(false);
                    }
                }
            }

             //if mouse collides with entity spot start dialogue
            if(location.getDialogue().getID() != -1) {
                if(Mouse.isCollided(location.getDialogue().getObj())) {
                    sm.setState(DIALOGUE, location.getDialogue().getID());
                    Mouse.setClickState(false);
                }
            }

        }

    }
}
