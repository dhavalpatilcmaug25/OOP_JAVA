/*
Problem 12: Remove Extra Text
Scenario: An automated message system sometimes adds extra text that needs to be removed before
sending messages to students.
Task: Use StringBuilder to clean up message content.
Sample Input:
Original Text: Please read - Do not disturb
Exact substring to delete: - Do not disturb
Expected Output:
Please read

 */

import java.util.*;
public class Q12_RemoveExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Orignal text: ");
        String str1 = sc.nextLine();

        System.out.println("Exact substring to delete: ");
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder(str1);

        int start = str1.indexOf(str2);

        if(start != -1){
            int end = start + str2.length();

            sb.replace(start, end, "");
        }
        System.out.println(sb.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q12_RemoveExtra.java
Orignal text: 
Please read - Do not disturb
Exact substring to delete:
- Do not disturb
Please read

 */