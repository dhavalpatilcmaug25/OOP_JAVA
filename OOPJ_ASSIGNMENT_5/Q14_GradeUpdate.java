/*
Problem 14: Grade Update System
Use Case: Update a student's marks in the grading system.
Requirements:
● Store student grades
● Update existing student's marks
● Display updated information
Sample Input:
Initial: "Rohan" → 78
Update: "Rohan" → 88
Expected Output:
Updated Grade: Rohan:88


code : 
 */


import java.util.*;
public class Q14_GradeUpdate {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rohan", 78);
        map.put("Rohan", 88);

        System.out.println("Updated Grade: Rohan:" + map.get("Rohan"));
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q14_GradeUpdate.java
Updated Grade: Rohan:88
 */