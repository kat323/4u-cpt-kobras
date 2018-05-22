package models;

public class Decision {
    public static final int PUZZLE = 1;
    public static final int DIALOGUE = 2;
    public static final int GRADE = 3;
    public static final int MARK = 4;
    public static final int SOCIAL = 5;

    private int id;
    private String[] choices;
    private int[] effects;
    private int[] dialogue;
    private int puzzle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Decision(int id, String[] choices, int[] effects, int[] dialogues, int puzzle ) {
        this.id = id;
        this.choices = choices;
        this.dialogue = dialogues;
        this.puzzle = puzzle;
        this.effects = effects;
    }

    public int choose(int index) {
        return effects[index];
    }



}
