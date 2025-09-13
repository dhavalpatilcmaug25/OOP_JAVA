/*
Problem 8: Course Registration System
Use Case: A student registers for courses, ensuring no duplicate course codes.
Requirements:
● Register for courses using course codes
● Prevent duplicate registrations
● Display registered courses
Sample Input:
Course codes: "CS101", "MA101", "CS101"
Expected Output:
Registered Courses: CS101, MA101


code : 
 */


import java.util.*;
public class Q8_CourseRegistration {
    public static void main(String[] args) {
        String[] CourseCode = {"CS101", "MA101", "CS101"};

        Set<String> h1 = new HashSet<>();

        for(String s : CourseCode){
            h1.add(s);
        }

        System.out.println("Registered Courses: " + String.join(", ", h1));
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q8_CourseRegistration.java
Registered Courses: CS101, MA101
 */