package game;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel implements Runnable{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    private StateManger sm;

    private BufferedImage image;
    private Graphics2D g;

    private Thread thread;
    private boolean running;
    private final int FPS = 30;
    private final int TARGET_TIME = 1000 / FPS;

    GamePanel() {
        init();
    }

    private void init() {
        JFrame frame = new JFrame("School Simulator");
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

        image = new BufferedImage(WIDTH, HEIGHT, 1);
        g = (Graphics2D) image.getGraphics();

        sm = new StateManger();

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        long start, elapsed, wait;
        while(running) {
            start = System.nanoTime();

            tick();

            elapsed =System.nanoTime() - start;
            wait = TARGET_TIME - elapsed / 1000000;

            if(wait <= 0) {
                wait = 5;
            }
            try{
                thread.sleep(wait);
            } catch(Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void tick() {
        sm.update();
        draw();
        drawToScreen();
    }
    public void draw() {
        sm.draw(g);
    }
    private void drawToScreen() {
        Graphics g2 = getGraphics();
        g2.drawImage(image, 0, 0, WIDTH , HEIGHT , null);
        g2.dispose();
    }

}
