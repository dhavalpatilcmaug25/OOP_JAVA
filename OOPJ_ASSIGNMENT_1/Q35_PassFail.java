/* 
35. Pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output:
Fail


Code: 
*/


import java.util.*;
public class Q35_PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int num = sc.nextInt();

        String number = num>=35 ? "Pass" : "Fail";

        System.out.println(number);
    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q35_PassFail.java
Enter marks: 33
Fail

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q35_PassFail.java
Enter marks: 45
Pass
*/