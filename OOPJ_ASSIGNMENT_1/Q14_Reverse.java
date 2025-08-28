/* 
14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321



Code: 
*/


import java.util.*;
public class Q14_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        while(number>0){
            int rem = number%10;
            sum = sum * 10 +rem;
            number = number/10;
        }
        System.out.println("Reversed number: "+sum);

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q14_Reverse.java
Enter 4-digit number: 1234 
Reversed number: 4321

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q14_Reverse.java
Enter 4-digit number: 7452
Reversed number: 2547
*/