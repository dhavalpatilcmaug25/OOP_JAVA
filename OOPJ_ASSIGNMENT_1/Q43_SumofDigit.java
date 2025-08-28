/* 
43. Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14


Code: 
*/


import java.util.*;
public class Q43_SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0){
            int last = num % 10;
            sum += last;
            num = num/10;
        }
        System.out.println("Sum of digits: "+ sum);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q43_SumofDigit.java
Enter 4-digit number: 321
Sum of digits: 6

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q43_SumofDigit.java
Enter number: 482 
Sum of digits: 14

*/