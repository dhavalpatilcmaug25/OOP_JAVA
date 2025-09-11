/*
Problem 7: Student List
Scenario: A school management system tries to load a student list from a file at the beginning of each
semester. Sometimes the file might not exist or be corrupted.
Task: Simulate file reading operation and handle FileNotFoundException.
Sample Input:
student_list.txt
Expected Output:
File not found


 */

import java.util.*;
import java.io.*;
public class Q7_StudentList {
    public static void main(String[] args) {
        
        try {
            File file = new File("student_list.txt");
            Scanner sc = new Scanner(file);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q7_StudentList.java
File not found
 */