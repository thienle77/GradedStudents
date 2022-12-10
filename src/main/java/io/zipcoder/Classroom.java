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
        System.out.println(students);
        return students;
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;

    }

    public void  addStudent(Student student) {
       for (int i = 0; i < students.length; i++){
           if(students[i] == null){
               students[i] = student;
           }
       }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++){
            if(students[i].getFirstName() == firstName
                && students[i].getLastName() == lastName){
                students[i] = null;
            }
        }
    }

}



