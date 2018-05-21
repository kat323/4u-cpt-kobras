package game;

import models.Dialogue;
import models.Location;
import models.puzzleModels.Puzzle;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * loads all the images and files into this class
 * contains static methods
 */
public class Content {

    public static HashMap<Integer,Dialogue> dialogues = new HashMap<>();
    public static HashMap<Integer, Puzzle> puzzles = new HashMap<>();
    public static HashMap<Integer, BufferedImage> images = new HashMap<>();
    public static HashMap<Integer, Location> locations = new HashMap<>();

    public static void init() {
        initPuzzles();
        initDialogues();
        initImages();
        initLocations();
    }


    public static void initPuzzles() {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("resources/gamedat/puzzles.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter("///");
        while(!sc.hasNext()) {
            // read data into chunks
        }
    }

    public static void initDialogues() {

    }

    /**
     * a method that initializes images to be used in the game
     */
    public static void initImages() {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("resources/images/imageList.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i = 1;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            try {
                images.put(i, ImageIO.read(Content.class.getResource(s)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }


    }

    public static void initLocations() {

    }

}
