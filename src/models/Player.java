package models;

import helpers.Content;
import models.puzzleModels.Puzzle;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * class that stores user information
 */
public class Player {
    private static int grade;
    private static int location;
    private static double[] average;
    private static double bonusAverage;
    private static int credits;
    private static ArrayList<Puzzle>[] coursesTaken = new ArrayList[4];
    private static int socialSkill;

    public Player() {
        for(int i = 0; i < 4; i++) {
            coursesTaken[i] = new ArrayList<>();
        }
        credits = 0;
        average = new double[4];
        location = 0;
        grade = 9;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int in) {
        grade += in;
        if(grade >= 13) {
            grade = 9;
        }
    }

    public static Location getLocation() {
        return Content.locations.get(location);
    }

    public static void setLocation(int move) {
        location = move;
    }

    public static double getAverage(int grade) {
        setAverage();
        return average[grade] + bonusAverage;
    }

    /**
     * sets all the averages
     */
    public static void setAverage() {
        int total = 0;
        int marks = 0;
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0;j < coursesTaken[i].size(); j++) {
                    marks += coursesTaken[i].get(j).getScore();
                    total += coursesTaken[i].get(j).getTotal();
                }
                average[i] = (double) marks / total;
                marks = 0;
                total = 0;
            }
        }catch (Exception e) {

        }
    }

    public static int getCredits() {
        return credits;
    }

    public static void increaseCredit() {
        credits++;
    }

    public static void setBonusAverage(double bonusAverage) {
        Player.bonusAverage += bonusAverage;
    }

    public static int getSocialSkill() {
        return socialSkill;
    }

    public static void setSocialSkill(int socialSkill) {
        Player.socialSkill += socialSkill;
    }
}
