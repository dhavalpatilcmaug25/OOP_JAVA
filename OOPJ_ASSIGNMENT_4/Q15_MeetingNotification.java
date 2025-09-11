/*
Problem 15: Meeting Notification
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time
and location details to basic meeting announcements.
Task: Use StringBuffer to create detailed meeting notifications.
Sample Input:
Base text: Meeting:
Text to append: Friday at 5 PM
Expected Output:
Meeting: Friday at 5 PM


*/

import java.util.*;
public class Q15_MeetingNotification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base Text: ");
        String str1 = sc.nextLine();

        System.out.print("Text to append: ");
        String str2 = sc.nextLine();

        StringBuffer s = new StringBuffer(str1);

        s.append(" " +str2);
        System.out.println(s.toString());
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q15_MeetingNotification.java
Base Text: Meeting:
Text to append: Friday at 5 PM
Meeting: Friday at 5 PM

 */