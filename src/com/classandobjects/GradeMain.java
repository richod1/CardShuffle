package com.classandobjects;

import java.util.Scanner;

import static com.classandobjects.GradeBook.displayMessage;

public class GradeMain {
    public static void main(String[] args){
        GradeBook obj=new GradeBook();
        obj.GradeBook();
        displayMessage();

        Scanner input=new Scanner(System.in);
        System.out.println("input your course name");

        String courseName=input.nextLine();
        obj.GradebookCourse(courseName);

        System.out.println("input your course name in the grade book");
        String courseNames=input.nextLine();
        obj.setCourseName(courseNames);

        obj.DisplayMessage();
    }
}
