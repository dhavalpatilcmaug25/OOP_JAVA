/*
Problem 12: Attendance Tracking System
Use Case: Track student attendance percentages in alphabetical order.
Requirements:
● Map student names to attendance percentages
● Maintain alphabetical order of students
● Display sorted attendance report
Sample Input:
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95
Expected Output:
Attendance Report: Amit:90, Priya:95, Rohan:85


code : 
 */


import java.util.*;
public class Q12_AttendanceTracking {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Amit", 90);
        map.put("Rohan", 85);
        map.put("Priya", 95);

        int count = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue() + ":" + entry.getKey());
            if(++count < map.size()){
                System.out.print(", ");
            }
        }
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q12_AttendanceTracking.java
90:Amit, 95:Priya, 85:Rohan
 */