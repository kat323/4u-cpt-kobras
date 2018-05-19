package stateFolder;

import game.GamePanel;
import game.StateManger;

import java.awt.*;

public class IntroState extends State {
    public IntroState(StateManger sm) {
        super(sm);
    }

    @Override
    public void init() {

    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRect(300, 300, 100, 100);
    }

    @Override
    public void update() {

    }
}
