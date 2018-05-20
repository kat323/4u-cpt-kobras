package game;

public class Mouse  {
    private static int x;
    private static int y;
    private static boolean clickState;

    public static boolean isClicked() {
        return clickState;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void setClickState(boolean b) {
        clickState = b;
    }

    public static void click(int x, int y, boolean clicked) {
        Mouse.x = x;
        Mouse.y = y;
        clickState = clicked;
    }

    public static void setX(int x) {
        Mouse.x = x;
    }

    public static void setY(int y) {
        Mouse.y = y;
    }
}
