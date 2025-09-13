/*
Problem 13: Student Registration Order Tracker
Use Case: Maintain the order in which students registered for a course.
Requirements:
● Record registration order
● Map student names to roll numbers
● Preserve insertion order
Sample Input:
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103
Expected Output:
Registration Order: Amit:101, Rohan:102, Priya:103



code : 
 */


import java.util.*;
public class Q13_StudentRegistration {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101,"Amit");
        map.put(102, "Rohan");
        map.put(103, "Priya");

        int count = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if(++count < map.size()){
                System.out.print(", ");
            }
        }
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q13_StudentRegistration.java
101:Amit, 102:Rohan, 103:Priya
 */