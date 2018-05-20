package models;

public class Decision {
    protected static final int PUZZLE = 1;
    protected static final int DIALOGUE = 2;
    protected static final int GRADE = 3;
    protected static final int MARK = 4;
    protected static final int SOCIAL = 5;

    private int ID;
    private String[] choices;
    private int dialogue;
    private int puzzle;


    public Decision(int ID, String[] choices,int dialogue, int puzzle ) {
        this.ID = ID;
        this.choices = choices;
        this.dialogue = dialogue;
        this.puzzle = puzzle;
    }

}
