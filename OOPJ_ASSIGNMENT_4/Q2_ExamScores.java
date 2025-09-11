/*
Problem 2: Exam Scores
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might
accidentally try to access the score of a student number that doesn't exist in the class roster.
Task: Create a program that stores exam scores in an array and safely accesses student scores by index.
Sample Input:
3
78 90 85
5
Expected Output:
Invalid index accessed


 */

 import java.util.*;
public class Q2_ExamScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int[n];
        try {
            for(int i=0; i<n; i++){
                scores[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int s = scores[m];
            System.out.println("Student score is " + s);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed");
        }
    }
}

/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q2_ExamScores.java
3
78 90 85
5
Invalid index accessed
 */