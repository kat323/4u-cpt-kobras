package game;

import models.Dialogue;
import models.Location;
import models.puzzleModels.Puzzle;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
        // initImages(); cant be non static
        initLocations();
    }
    public static void initPuzzles() {
        Scanner sc = new Scanner("puzzles.txt");
        sc.useDelimiter("///");
        while(!sc.hasNext()) {
            // read data into chunks
        }
    }

    public static void initDialogues() {

    }

    public static void initImages() {
        
        try {
            images.put(1, ImageIO.read(Content.class.getResource("/images/imageTest.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initLocations() {

    }

}
