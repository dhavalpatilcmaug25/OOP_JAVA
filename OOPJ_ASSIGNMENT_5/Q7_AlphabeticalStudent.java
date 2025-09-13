/*
Problem 7: Alphabetical Student Directory
Use Case: A school wants to maintain student names in alphabetical order.
Requirements:
● Add student names
● Automatically maintain alphabetical sorting
● Display sorted name
Sample Input:
Students: "Rohan", "Amit", "Priya"
Expected Output:
Students: Amit, Priya, Roh

code : 
 */


import java.util.*;
public class Q7_AlphabeticalStudent {
    public static void main(String[] args) {
        String[] Students = {"Rohan", "Amit", "Priya"};

        Set<String> h1 = new TreeSet<>();

        for(String s : Students){
            h1.add(s);
        }

        System.out.println("Students: " + String.join(", ", h1));
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q7_AlphabeticalStudent.java
Students: Amit, Priya, Rohan
 */