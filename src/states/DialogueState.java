package states;

import game.StateManager;
import helpers.Content;
import models.Speaker;

import java.awt.*;

public class DialogueState extends State {
    private int id;
    Speaker[] speakers;
    private int index;

    public DialogueState(StateManager sm, int id) {
        super(sm);
        this.id = id;
    }

    @Override
    public void init() {
    }

    @Override
    public void draw(Graphics2D g) {
        // draw background
        // draw the text
        // draw the name
        // draw the character
    }

    @Override
    public void update() {
        handleInput();
    }

    @Override
    public void handleInput() {
        // if mouse clicked then set isClicked false
        // then switch over to next speaker
        // if no more speakers, then if decision
        // switch to setState(decision, decision id)
        // else set state to Location
    }
}
