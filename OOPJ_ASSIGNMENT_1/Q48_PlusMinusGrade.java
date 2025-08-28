/* 
48. Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−




Code: 
*/


import java.util.*;
public class Q48_PlusMinusGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

         String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 85) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "A-";
        } else if (marks >= 75) {
            grade = "B+";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 65) {
            grade = "B-";
        } else if (marks >= 60) {
            grade = "C+";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid marks!";
        }

        if (marks >= 0 && marks <= 100) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Please enter marks between 0 and 100.");
        }
        
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q48_PlusMinusGrade.java
Enter marks: 78
Grade: B+
*/