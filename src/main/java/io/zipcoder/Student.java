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

    public Double[] getExamScores() {
        return null;
    }

    public Double[] setExamScores(int  examNumber, double newScore){
        return null;
    }

    public Double[] addExamScores(double examScore){
        return null;
    }

    public Double[] getAverageExamScores(){
        return null;
    }

}

