/*
Problem 9: Event Attendance Counter
Use Case: Count unique attendees at an event, handling duplicate check-ins.
Requirements:
● Record attendee names
● Count only unique attendees
● Handle duplicate entries
Sample Input:
Attendees: "Amit", "Rohan", "Amit", "Priya"
Expected Output:
Total unique attendees: 3



code : 
 */


import java.util.*;
public class Q9_EventAttendance {
    public static void main(String[] args) {
        String[] Attendees = {"Amit", "Rohan", "Amit", "Priya"};

        Set<String> h1 = new HashSet<>();

        for(String s : Attendees){
            h1.add(s);
        }

        System.out.println("Total unique attendees: " + h1.size());
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q9_EventAttendance.java
Total unique attendees: 3
 */