/* 
33. Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output:
Number is Odd


Code: 
*/


import java.util.*;
public class Q33_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String number = num%2 == 0 ? "Even" : "Odd";

        System.out.println("Number is "+ number);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q33_EvenOdd.java
Enter a number: 17
Number is Odd

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q33_EvenOdd.java
Enter a number: 16
Number is Even
*/