/*
Problem 6: Unique Roll Number Validator
Use Case: A registration system must ensure no duplicate roll numbers are assigned.
Requirements:
● Accept roll numbers for registration
● Automatically remove duplicates
● Display unique roll numbers
Sample Input:
Roll numbers: 101, 102, 101, 103
Expected Output:
Unique Roll Numbers: 101, 102, 103

code : 
 */


import java.util.*;
public class Q6_UniqueRollno {
    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>();

        h1.add(101);
        h1.add(102);
        h1.add(101);
        h1.add(103);

        System.out.println(h1);
    }
}


/*
Output:

ASSIGNMENT_5> java Q6_UniqueRollno.java
[101, 102, 103]
 */