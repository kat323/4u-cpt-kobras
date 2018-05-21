package stateFolder;

import game.StateManager;
import models.Speaker;

import java.awt.*;

public class DialogueState extends State {
    private int id;
    private Speaker[] speakers;

    public DialogueState(StateManager sm, int id) {
        super(sm);
        this.id = id;
    }

    @Override
    public void init() {
        // set speakers = to Content.getDialogue(id).getSpeakers()
    }

    @Override
    public void draw(Graphics2D g) {

    }

    @Override
    public void update() {

    }

    @Override
    public void handleInput() {

    }
}
