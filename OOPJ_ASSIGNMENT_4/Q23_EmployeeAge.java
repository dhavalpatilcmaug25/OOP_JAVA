/*
Problem 23: Employee Age Management
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int
values to Integer objects for database storage and collection operations.
Task: Demonstrate autoboxing by converting primitive int to Integer object.
Sample Input:
30
Expected Output:
Integer object: 30


*/

import java.util.*;
public class Q23_EmployeeAge {
    
    public static void main(String[] args) {

        int a = 30;
        Integer a1 = a;

        System.out.println("Integer Object: " + a1);
    }
}


/* 

java Q23_EmployeeAge.java
Integer Object: 30

 */