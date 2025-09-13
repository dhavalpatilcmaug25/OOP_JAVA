/*
Problem 2: Lab Access Queue System
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served
system.
Requirements:
● Students join the queue for lab access
● Process students in FIFO order
● Display remaining queue
Sample Input:
Enqueue: "Amit", "Priya", "Rohan"
Dequeue: 1 student
Expected Output:
Queue: Priya, Rohan


code : 
 */


import java.util.*;
public class Q2_LabAccessQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Amit");
        q.offer("Priya");
        q.offer("Rohan");

        q.poll();

        System.out.println("Queue: " + q);
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q2_LabAccessQueue.java
Queue: [Priya, Rohan]
 */