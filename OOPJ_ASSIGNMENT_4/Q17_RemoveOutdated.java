/*
Problem 17: Remove Outdated Information
Scenario: An academic system maintains course information that includes year details. When information
becomes outdated, the year needs to be removed.
Task: Use StringBuffer to remove outdated information.
Sample Input:
Original text: CDAC Kharghar 2024
Exact substring to delete: 2024
Expected Output:
CDAC Kharghar

*/

import java.util.*;
public class Q17_RemoveOutdated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Original Text: ");
        String str1 = sc.nextLine();

        System.out.print("Exact substring to delete: ");
        String str2 = sc.nextLine();

        StringBuffer s = new StringBuffer(str1);

        int start = s.indexOf(str2);

        if(start != -1){
            int end = start + str2.length();
            s.delete(start, end);
        }

        System.out.println(s.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q17_RemoveOutdated.java
Original Text: CDAC Kharghar 2024 
Exact substring to delete: 2024
CDAC Kharghar

 */