package game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel implements Runnable, MouseListener, MouseMotionListener {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    public JPanel pane;
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
        setFocusable(true);
        requestFocus();
        addMouseListener(this);
        addMouseMotionListener(this);

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

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        Mouse.click(e.getX(),e.getY() ,true );
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        Mouse.click(e.getX(),e.getY() ,false );
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Mouse.setX(e.getX());
        Mouse.setY(e.getY());
    }
    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
