package game;

import stateFolder.*;

import java.awt.*;
import java.util.ArrayList;

public class StateManger {
    private static State[] states;
    private int currState;
    private int prevState;
    public static final int INTRO = 0;
    public static final int MENU = 1;
    public static final int PUZZLE = 2;
    public static final int DIALOGUE = 3;
    public static final int LOCATION = 4;
    public static final int MAP = 5;
    public static final int NUM_STATES = 6;


    public void StateManager() {
        init();

    }
    public void init() {
        states = new State[NUM_STATES];
        setState(INTRO);
    }

    public void setState(int a) {
        prevState= currState;
        destroy(prevState);
        currState = a;

        if(a == INTRO) {
            states[a] = new IntroState(this);
            states[a].init();
        } else if(a == MENU) {
            states[a] = new MenuState(this);
            states[a].init();
        }else if(a == PUZZLE) {
            states[a] = new puzzleState(this);
            states[a].init();
        }else if(a == DIALOGUE) {
            states[a] = new DialogueState(this);
            states[a].init();
        }else if(a == LOCATION) {
            states[a] = new LocationState(this);
            states[a].init();
        }else if(a == MAP) {
            states[a] = new MapState(this);
            states[a].init();
        }
    }
    public void destroy(int a) {
        states[a] = null;
    }

    public void draw(Graphics2D g) {
        states[currState].draw(g);
    }

    public void update() {
        states[currState].update();
    }

}
