package stateFolder;

import game.Content;
import game.Mouse;
import game.StateManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * the welcome screen of the game
 */
public class IntroState extends State {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;


    public IntroState(StateManager sm) {
        super(sm);
    }




    @Override
    public void init() {
    }

    @Override
    public void draw(Graphics2D g) {

        g.drawImage(Content.images.get(1),0 ,0 ,800,800, null );

        g.fillRect(300, 300, 300, 150);

    }

    @Override
    public void update() {
        handleInput();
    }

    @Override
    public void handleInput() {
        if(Mouse.isClicked() && Mouse.isCollided(300,300,300,150))
            sm.setState(sm.LOCATION, 0);
    }
}
