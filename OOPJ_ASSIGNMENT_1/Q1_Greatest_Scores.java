/* 
1. Greatest of Two Test Scores
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
which test the friend scored higher in.
Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score.


Code: 
*/


import java.util.*;
public class Q1_Greatest_Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score for Test 1: ");
        int Test1 = sc.nextInt();
        System.out.print("Enter score for Test 2: ");
        int Test2 = sc.nextInt();

        if(Test1 > Test2){
            System.out.println("Test 1 has higher score");
        }else{
            System.out.println("Test 2 has higher score");
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q1_Greatest_Scores.java
Enter score for Test 1: 78
Enter score for Test 2: 85
Test 2 has higher score 
*/