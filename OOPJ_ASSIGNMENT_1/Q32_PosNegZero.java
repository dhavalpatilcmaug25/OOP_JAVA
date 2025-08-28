/* 
32. Positive, Negative, or Zero (Ternary)
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.
Input:
Enter a number: -12
Output:
Number is Negative

Code: 
*/


import java.util.*;
public class Q32_PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String number = num == 0 ? "Zero" : (num > 0) ? "Positive" : "Negative";

        System.out.println("Number is "+ number);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q32_PosNegZero.java
Enter a number: -12
Number is Negative
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q32_PosNegZero.java
Enter a number: 11
Number is Positive
PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q32_PosNegZero.java
Enter a number: 0
Number is Zero
*/