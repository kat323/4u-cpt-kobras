package models;

import models.puzzleModels.Puzzle;

import java.util.ArrayList;

public class Player {
    private int grade;
    private int location;
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

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public double getAverage(int grade) {
        setAverage();
        return average[grade];
    }

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

    public void setCredits(int add) {
        credits += add;
    }
}
