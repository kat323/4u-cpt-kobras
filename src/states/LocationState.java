package states;

import game.StateManager;
import helpers.Content;
import helpers.Drawer;
import helpers.Mouse;
import models.ImgObj;
import models.Location;
import models.Player;

import java.awt.*;

import static game.StateManager.DIALOGUE;

/**
 * displays the current room as well as possible directions
 * Allows the user to click on arrows to move, or interact with surroundings
 */
public class LocationState extends State {

    private static ImgObj[] arrows = {Content.images.get(1),Content.images.get(2), Content.images.get(3), Content.images.get(4)};
    private static Location location;


    public LocationState(StateManager sm) {
        super(sm);
    }

    @Override
    public void init() {

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
        location = Player.getLocation();
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
                        Player.setLocation(move);
                    }
                }
            }
            if(location.getDialogue().getObj().id != -1) {
                if(Mouse.isCollided(location.getDialogue().getObj())) {
                    sm.setState(DIALOGUE, location.getDialogue().getID());
                }
            }
        }

        // if mouse collides with entity spot start dialogue

    }
}
