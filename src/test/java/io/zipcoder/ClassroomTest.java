package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void testGetStudents() {
    }
    @Test
    public void getAverageExamScoreTest() {
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };
        Double expected = 125.0;
        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        Double output = classroom.getAverageExamScore();
        System.out.println(output);
        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void addStudentTest() {

    }

    @Test
    public void removeStudent() {

    }
}