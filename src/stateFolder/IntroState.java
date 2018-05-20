package stateFolder;


import game.StateManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class IntroState extends State {
    public IntroState(StateManager sm) {
        super(sm);
    }




    @Override
    public void init() {

    }
    BufferedImage image;
    @Override
    public void draw(Graphics2D g) {
        try {
            image  =ImageIO.read(this.getClass().getResource("/images/imageTest.png"));
        }catch(Exception e) {

        }
        g.drawImage(image,0 ,0 ,800,800, null );
    }

    @Override
    public void update() {

    }

    @Override
    public void handleInput() {

    }
}
