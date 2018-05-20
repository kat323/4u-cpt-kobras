package models;

import models.puzzleModels.Puzzle;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * class that stores user information
 */
public class Player implements Serializable {
    private int grade;
    private static int location;
    private double[] average;
    private int credits;
    private ArrayList<Puzzle>[] coursesTaken = new ArrayList[4];

    public Player() {
        for(int i = 0; i < 4; i++) {
            coursesTaken[i] = new ArrayList<>();
        }
        credits = 0;
        average = new double[4];
        location = 0;
        grade = 0;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getLocation() {
        return location;
    }

    public static void setLocation(int move) {
        location = move;
    }

    public double getAverage(int grade) {
        setAverage();
        return average[grade];
    }

    /**
     * sets all the averages
     */
    public void setAverage() {
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

    public int getCredits() {
        return credits;
    }

    public void increaseCredit() {
        credits++;
    }
}
