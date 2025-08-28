/* 
34. Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output:
Eligible to vote

Code: 
*/


import java.util.*;
public class Q34_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int num = sc.nextInt();

        String number = num>18 ? "Eligible" : "Not Eligible";

        System.out.println(number + " to vote");
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q34_Voting.java
Enter age: 20
Eligible to vote

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q34_Voting.java
Enter age: 15
Not Eligible to vote
*/