/*
Problem 24: Salary Calculation
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs
primitive int values for mathematical calculations.
Task: Demonstrate unboxing by extracting primitive values from wrapper objects.
Sample Input:
25
Expected Output:
int value: 25


*/

import java.util.*;
public class Q24_SalaryCalculation {
    
    public static void main(String[] args) {

        Integer a1 = 25;
        int a = a1;

        System.out.println("int value: " + a);
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q24_SalaryCalculation.java
int value: 25

 */