/* 
15. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number



Code: 
*/


import java.util.*;
public class Q15_LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        
        int A = num / 1000;
        int B = (num / 100) % 10;
        int C = (num / 10) % 10;
        int D = num % 10;

        
        if((A+B) == (C+D)){
            System.out.println("Lucky Number");
        }else{
            System.out.println("Not a lucky number");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q15_LuckyNumber.java
Enter 4-digit number: 3241
Lucky Number

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q15_LuckyNumber.java
Enter 4-digit number: 3212
Not a lucky number
*/