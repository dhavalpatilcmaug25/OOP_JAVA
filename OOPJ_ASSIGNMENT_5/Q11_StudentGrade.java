/*
Problem 11: Student Grade Management
Use Case: A teacher needs to map student names to their exam marks.
Requirements:
● Store student name and marks pairs
● Retrieve marks by student name
● Display all student-marks mappings
Sample Input:
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78
Expected Output:
Grade Report: Amit:85, Priya:92, Rohan:78


code : 
 */


import java.util.*;
public class Q11_StudentGrade {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(85, "Amit");
        map.put(92, "Priya");
        map.put(78, "Rohan");

        int count = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(entry.getValue() + ":" + entry.getKey());
            if(++count < map.size()){
                System.out.print(", ");
            }
        }
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q11_StudentGrade.java
Amit:85, Priya:92, Rohan:78
 */