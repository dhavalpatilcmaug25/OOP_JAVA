/*
Problem 10: Greeting Message
Scenario: A learning management system generates personalized greeting messages for students. The
system starts with a basic greeting and adds course-specific information.
Task: Use StringBuilder to create a personalized greeting message.
Sample Input:
Initial Text: Hello
Text to insert: CDAC
Insert Index: 6
Text to append: Java Student
Expected Output:
Hello CDAC Java Student


 */

import java.util.*;
public class Q10_GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();

        System.out.print("Initail Text: ");
        String str1 = sc.nextLine();
        s.append(str1);
        System.out.print("Text to insert: ");
        String str2 = sc.nextLine();

        System.out.print("Insert Index: ");
        int idx = sc.nextInt();
        sc.nextLine();
        s.insert(idx, " " + str2);

        System.out.print("Text to append: ");
        String str4 = sc.nextLine();
        s.append(" " + str4);
        
        System.out.println(s.toString());
    }
}


/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q10_GreetingMessage.java
Initail Text: Hello
Text to insert: CDAC
Insert Index: 5
Text to append: Java Student
Hello CDAC Java Student

 */