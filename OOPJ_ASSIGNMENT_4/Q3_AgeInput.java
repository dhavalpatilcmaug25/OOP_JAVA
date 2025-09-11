/*
Problem 3: Age Input
Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally
enter text instead of numbers, causing the system to crash.
Task: Create a registration system that safely converts age input from string to integer.
Sample Input:
eighteen
Expected Output:
Invalid number format

 */

 import java.util.*;
public class Q3_AgeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int age = Integer.parseInt(input);
            System.out.println("user age is " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}

/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q3_AgeInput.java
eightteen
Invalid number format
 */