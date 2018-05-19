package game;

import stateFolder.*;

import java.util.ArrayList;

public class StateManger {
    private static ArrayList<State> states = new ArrayList<State>();
    private int currState;
    private int prevState;
    public static final int INTRO = 0;
    public static final int MENU = 1;
    public static final int PUZZLE = 2;
    public static final int DIALOGUE = 3;
    public static final int LOCATION = 4;
    public static final int MAP = 5;


    public void StateManager() {
        init();
    }
    public void init() {
        states.add(new IntroState());
        states.add(new MenuState());
        states.add(new puzzleState());
        states.add(new DialogueState());
        states.add(new LocationState());
        states.add(new MapState());

        currState = 0;
    }

}
