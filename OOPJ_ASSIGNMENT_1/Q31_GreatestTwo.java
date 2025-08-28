/* 
31. Greatest of Two Numbers (Ternary)
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest
using a ternary operator.
Input:
Enter first number: 45
Enter second number: 30
Output:
Greatest number: 45


Code: 
*/


import java.util.*;
public class Q31_GreatestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = num1>num2 ? num1 : num2;

        System.out.println("Greatest number: "+ max);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q31_GreatestTwo.java
Enter first number: 45
Enter second number: 30
Greatest number: 45

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q31_GreatestTwo.java
Enter first number: 8  
Enter second number: 43
Greatest number: 43
*/