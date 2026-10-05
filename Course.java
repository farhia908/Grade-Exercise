package GradedExercise2;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
        students = new String[4];
        numberOfStudents = 0;
    }
    public String getCourseName(){
        return courseName;
    }
    //Add student
    public void addStudent(String student){
        // if array is full
       if (numberOfStudents == students.length){
           students = Arrays.copyOf(students, students.length *2);
       }
       students[numberOfStudents] = student;
       numberOfStudents ++;
    }
    // drop array
    public void dropStudent(String student){
        for (int i = 0; i < numberOfStudents; i++){
            if (students[i].equals(student)){
                for (int j = 0; j < numberOfStudents - 1; j++){
                    students[j]= students[j + 1];
                }
                numberOfStudents --;

                students[numberOfStudents] = null;

                break;
            }
        }
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    //Objects..
    public static void main(String[] args){
        Course course1 = new Course("Data Structure");
        course1.addStudent("Ali");
        course1.addStudent("Aisha");
        course1.addStudent("Mohamed");

        System.out.println("Course: " + course1.getCourseName());
        System.out.println("Number of Students: " + course1.getNumberOfStudents());
        System.out.println("Students:");

        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.println(course1.getStudents()[i]);
        }

    }
}
