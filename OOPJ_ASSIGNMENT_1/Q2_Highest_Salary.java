/* 
2. Highest Salary Among Three Offers
Scenario: You have three job offers. Take the offered salaries as input and print which company is
offering the highest salary.
Input:
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Output:
Company 2 offers the higest salary


Code: 
*/


import java.util.*;
public class Q2_Highest_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary for Company 1: ");
        int a = sc.nextInt();
        System.out.print("Enter salary for Company 2: ");
        int b = sc.nextInt();
        System.out.print("Enter salary for Company 3: ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("Company 1 offers the higest salary");
        }else if(b > c){
            System.out.println("Company 2 offers the higest salary");
        }else{
            System.out.println("Company 3 offers the higest salary");
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q2_Highest_Salary.java
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Company 2 offers the higest salary
*/