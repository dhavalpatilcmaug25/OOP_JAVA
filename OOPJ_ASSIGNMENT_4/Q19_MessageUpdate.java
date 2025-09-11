/*
Problem 19: Message Update System
Scenario: A communication system needs to update message status from "Old Notice" to "Updated
Notice" when information is refreshed.
Task: Use StringBuffer to update message status.
Sample Input:
Original text: Old Notice
Text to find: Old
Replacement text: Updated
Expected Output:
Updated Notice


*/

import java.util.*;
public class Q19_MessageUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Original Text: ");
        String str1 = sc.nextLine();

        System.out.print("Text to find: ");
        String str2 = sc.nextLine();

        System.out.print("Replacemnet text: ");
        String str3 = sc.nextLine();

        StringBuffer s = new StringBuffer(str1);

        int start = s.indexOf(str2);

        if(start != -1){
            int end = start + str2.length();
            s.replace(start, end, str3);
        }

        System.out.println(s.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q19_MessageUpdate.java
Original Text: Old Notice
Text to find: Old
Replacemnet text: Updated
Updated Notice

 */