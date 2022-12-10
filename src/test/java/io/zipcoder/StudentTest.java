package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetFirstName() {
        Double[] exams = {100.0, 95.0};
        Student student = new Student("Bob", "Smith", exams);
        String expected = "Bob";
        String actual = student.getFirstName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetLastName() {
        Double[] exams = {100.0, 95.0};
        Student student = new Student("Bob", "Smith", exams);
        String expected = "Smith";
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfExamsTaken() {
        Double[] exams = {100.0, 95.0};
        Student student = new Student("Bob", "Smith", exams);
        int expected = 2;
        int actual = student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFirstName() {
        Double[] exams = {100.0, 95.0};
        Student student = new Student("Bob", "Smith", exams);
        String expected = "Bob";
        student.setFirstName(expected);
        String actual = student.getFirstName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetLastName() {
        Double[] exams = {100.0, 95.0};
        Student student = new Student("Bob", "Smith", exams);
        String expected = "George";
        student.setLastName(expected);
        String actual = student.getLastName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetExamScores() {
        Double[] exams = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student("Bob", "Smith", exams);
        String expected = "Exam Scores:\n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 123.0\n" +
                "Exam 4 -> 96.0\n";
        //student.getExamScores();
        String actual = student.getExamScores();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAddExamScore() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" +
                "Exam 1 -> 100.0\n";
        //When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        //Then
        Assert.assertEquals(expected, output);
    }
    @Test
    public void testSetExamScore() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" +
                "Exam 1 -> 150.0\n";
        //When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        //Then
        Assert.assertEquals(expected, output);
    }
    @Test
    public void testGetAverageExamScore() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 125.0;
        // When
        Double output = student.getAverageExamScore();

        //Then
        Assert.assertEquals(expected, output);
    }
    @Test
    public void testTestToString() {
        //Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 150.0\n" +
                "Exam 3 -> 250.0\n" +
                "Exam 4 -> 0.0\n";
        //When
        String output = student.toString();

        //Then
        Assert.assertEquals(expected, output);
    }

}