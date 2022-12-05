package io.zipcoder;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom (Student[] studentRoster) {
        students = studentRoster;
    }

    public Classroom(){
        this(30);
    }

    public Student[] getStudents () {
        return students;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;

    }

    public void addStudent(Student students) {
        students.addExamScore(getAverageExamScore());
    }

    public void removeStudent(String firstName, String lastName) {
    }

    public String[] getStudentByScore() {
        return null;
    }





















}
