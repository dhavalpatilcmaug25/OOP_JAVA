/* 
20. Basic Calculator Using If-Else
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using
nested if-else.
Input:
Enter first number: 10
Enter second number: 5
Enter operator: *


Code: 
*/


import java.util.*;
public class Q20_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+':
                int sum = num1 + num2;
                System.out.println("Result "+ sum);
                break;
            case '-':
                int diff = num1 - num2;
                System.out.println("Result "+ diff);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println("Result "+ mul);
                break;
            case '/':
                int div = num1 / num2;
                System.out.println("Result "+ div);
                break;
            case '%':
                int mod = num1 % num2;
                System.out.println("Result "+ mod);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q20_Calculator.java
Enter first number: 10
Enter second number: 5
Enter operator: *
Result 50
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q20_Calculator.java
Enter first number: 20
Enter second number: 10
Enter operator: +
Result 30
*/