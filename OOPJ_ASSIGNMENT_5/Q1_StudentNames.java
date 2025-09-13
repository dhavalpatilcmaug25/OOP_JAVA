/*
Problem 1: Student Names Management System
Use Case: A school administrator needs to maintain a list of student names for a class roster.
Requirements:
● Add student names to the roster
● Display all students
● Remove a student from the roster
Sample Input:
Add students: "Amit", "Priya", "Rohan"
Remove student: "Priya"
Expected Output:
Students: Amit, Rohan


code : 
 */


import java.util.*;
public class Q1_StudentNames {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Amit");
        a.add("Priya");
        a.add("Rohan");
        
                System.out.println("Add students: " + a);

        System.out.println("Remove student: " + a.remove(1));

        System.out.println("Student:"+a);
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q1_StudentNames.java
Add students: [Amit, Priya, Rohan]
Remove student: Priya
Student:[Amit, Rohan]
 */