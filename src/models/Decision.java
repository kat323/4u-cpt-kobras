package models;

import static stateFolder.DecisionState.*;

public class Decision {


    private int ID;
    private String[] choices;
    private int[] effects;
    private int[] dialogue;
    private int puzzle;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public int[] getEffects() {
        return effects;
    }

    public void setEffects(int[] effects) {
        this.effects = effects;
    }

    public int[] getDialogue() {
        return dialogue;
    }

    public void setDialogue(int[] dialogue) {
        this.dialogue = dialogue;
    }

    public int getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(int puzzle) {
        this.puzzle = puzzle;
    }

    public Decision(int ID, String[] choices, int[] effects, int[] dialogues, int puzzle ) {
        this.ID = ID;
        this.choices = choices;
        this.dialogue = dialogue;
        this.puzzle = puzzle;
    }

    public int choose(int index) {
        return effects[index];
    }



}
