package com.classandobjects;

public class GradeBook {
    public void GradeBook(){
        System.out.println("Welcome to grade book");
    }
    public static void displayMessage(){
        System.out.println("THis is grade book message");
    }
    public String GradebookCourse(String courseName){
        System.out.println("Welcome to the grade course book for \n"+ courseName);
        return courseName;
    }


    private String courseName;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void DisplayMessage(){
        System.out.println("welcome to the grade book for " + getCourseName());
    }
}
