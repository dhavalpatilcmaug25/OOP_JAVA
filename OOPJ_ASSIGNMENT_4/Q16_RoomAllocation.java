/*
Problem 16: Room Allocation Update
Scenario: A facility management system assigns rooms to different activities and needs to insert building
information into existing room numbers.
Task: Use StringBuffer to update room allocation information.
Sample Input:
Original text: 101
Text to insert: New Building
Insert index: 0
Expected Output:
New Building 101

*/

import java.util.*;
public class Q16_RoomAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Original Text: ");
        String str1 = sc.nextLine();

        System.out.print("Text to append: ");
        String str2 = sc.nextLine();

        System.out.print("Insert index: ");
        int idx = sc.nextInt();

        StringBuffer s = new StringBuffer(str1);

        s.insert(idx, " " + str2 + " ");
        System.out.println(s.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q16_RoomAllocation.java
Original Text: 101
Text to append: New Building
Insert index: 0
New Building 101

 */