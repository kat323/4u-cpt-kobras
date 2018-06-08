package models;

import models.puzzleModels.Puzzle;

public class Decision {
    public static final int PUZZLE = 1;
    public static final int DIALOGUE = 2;
    public static final int GRADE = 3;
    public static final int MARK = 4;
    public static final int SOCIAL = 5;

    public String[] choices;
    public int[] effects;
    public int[] dialogue;
    public Puzzle puzzle;
    public Dialogue[] dialogues;


    public Decision(String[] choices, int[] effects, int[] dialogue, Puzzle puzzle ) {
        this.choices = choices;
        this.dialogue = dialogue;
        this.puzzle = puzzle;
        this.effects = effects;
        dialogues = new Dialogue[2];
    }


}
