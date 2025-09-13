/*
Problem 3: Daily Task Tracker
Use Case: A student wants to track their daily tasks and mark completed ones.
Requirements:
● Add tasks to the list
● Mark tasks as completed (remove them)
● Display remaining tasks
Sample Input:
Add tasks: "Study Java", "Complete Assignment", "Exercise"
Complete task: "Exercise"
Expected Output:
Remaining tasks: Study Java, Complete Assignment


code : 
 */


import java.util.*;
public class Q3_DailyTask {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("Study Java");
        a.add("Complete Assignment");
        a.add("Exercise");
        System.out.println("Add tasks: " + a);
        String Ctask = "Exercise";
        System.out.println("Complete task: " + Ctask);

        a.remove(Ctask);

        System.out.println("Remaining tasks: " + a);
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q3_DailyTask.java
Add tasks: [Study Java, Complete Assignment, Exercise]
Complete task: Exercise
Remaining tasks: [Study Java, Complete Assignment]
 */