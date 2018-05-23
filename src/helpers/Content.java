package helpers;

import models.Decision;
import models.Dialogue;
import models.Location;
import models.ImgObj;
import models.puzzleModels.Puzzle;
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

    public static HashMap<Integer, Dialogue> dialogues = new HashMap<>();
    public static HashMap<Integer, Puzzle> puzzles = new HashMap<>();
    public static HashMap<Integer, ImgObj> images = new HashMap<>();
    public static HashMap<Integer, Location> locations = new HashMap<>();
    public static HashMap<Integer, Decision> decisions = new HashMap<>();

    public static void init() {
        initImages();
        initPuzzles();
        initDialogues();
        initLocations();
        initDecisions();
    }


    public static void initPuzzles() {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("resources/gamedat/puzzles.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter("///");
        while(sc.hasNext()) {
            // read data into chunks
            // create classes into the
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

        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            Scanner imgSc = new Scanner(s);
            try {
                int id = Integer.parseInt(imgSc.next());
                int x = Integer.parseInt(imgSc.next());
                int y = Integer.parseInt(imgSc.next());
                int width = Integer.parseInt(imgSc.next());
                int height = Integer.parseInt(imgSc.next());
                BufferedImage img = ImageIO.read(Content.class.getResource(imgSc.next()));

                images.put(id, new ImgObj(id ,x, y, width, height, img) );
            } catch (IOException e) {
                e.printStackTrace();
            }
            imgSc.close();
        }


    }

    public static void initLocations() {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("resources/gamedat/locations.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            Scanner sc2 = new Scanner(s);
            try {
                int id = Integer.parseInt(sc2.next());
                int[] directions = new int[4];
                for(int i = 0; i < 4; i++) {
                    directions[i] = Integer.parseInt(sc2.next());
                }
                ImgObj img = Content.images.get(Integer.parseInt(sc2.next()));
                Dialogue[][] dialogue = new Dialogue[4][2]; // [grade] , [before and after]
                for(int i = 0; i < 4; i++) {
                    for(int j = 0; j < 2; j++) {
                        dialogue[i][j] = Content.dialogues.get(Integer.parseInt(sc2.next()));
                    }
                }
                Content.locations.put(id,new Location(id, directions ,img , dialogue ));

            }catch(Exception e) {

            }
        }
    }

    public static void initDecisions() {

    }



}
