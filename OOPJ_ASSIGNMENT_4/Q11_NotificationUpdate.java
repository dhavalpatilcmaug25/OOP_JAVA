/*
Problem 11: Notification Update
Scenario: A university notification system needs to update announcements when exam schedules change.
The system should efficiently replace old information with new information.
Task: Use StringBuilder to update notification messages.
Sample Input:
Original text: Exam postponed
Text to find: postponed
Replacement Text: rescheduled
Expected Output:
Exam rescheduled

 */

import java.util.*;
public class Q11_NotificationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Orignal text: ");
        String str1 = sc.nextLine();
        
        System.out.println("Text to find: ");
        String toFind = sc.nextLine();
        
        System.out.println("Replacement Text: ");
        String replace = sc.nextLine();
        
        StringBuilder s = new StringBuilder(str1);
        
        int start = str1.indexOf(toFind);

        if(start != -1){
            int end = start + toFind.length();

            s.replace(start, end, replace);
        }
        
        System.out.println(s.toString());
    }
}


/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q11_NotificationUpdate.java
Orignal text: 
Exam postponed
Text to find:
postponed
Replacement Text:
rescheduled
Exam rescheduled

 */