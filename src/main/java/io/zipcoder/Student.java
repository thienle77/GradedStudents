package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student (String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public Student () {
        this.firstName = "First Name";
        this.lastName = "Last Name";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String scores = "Exam Scores:\n";
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            scores += ("Exam " + (i + 1) + " -> " + examScores.get(i) + "\n");
        }
        return scores;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            sum += examScores.get(i);
        }
        return sum / getNumberOfExamsTaken();
    }
    @Override
    public String toString() {
        //return "Student name :" + getFirstName() + " " + getLastName() + "\n" +
               // "Average score:" + getAverageExamScore() + "\n" + getExamScores();
        return getExamScores();
    }
}

