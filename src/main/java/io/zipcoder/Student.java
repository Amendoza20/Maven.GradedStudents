package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName = "";
    String lastName = "";
    ArrayList<Double> testScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName= firstName;
        this.lastName= lastName;
        for(Double score : testScores){
            this.testScores.add(score);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   /* public ArrayList<Double> getExamScore() {
        return testScores;
    } */
    //public Double getNumberOfExamsTaken(){
    //    return numberOfExamsTaken;
    //}

    public String getExamScores() {

        //String result = "";
        for(Double index: testScores) {
            System.out.println(index);

        }
        return "";
    }
    public Double addExamScore(Double examScore){
        testScores.add(examScore);
        return null;
    }
}




