/*
Problem 19: Grade Report Generator
Use Case: Display all student grades using proper iteration techniques.
Requirements:
● Iterate through student-grade mappings
● Display formatted grade report
● Use Iterator pattern
Sample Input:
Student grades: "Amit" → 85, "Priya" → 92
Expected Output:
Grade Report: Amit:85, Priya:92


code : 
 */


import java.util.*;
public class Q19_GradeReport {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amit", 85);
        map.put("Priya", 92);
        
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            System.out.print(entry.getKey() + " : " + entry.getValue());
            if(itr.hasNext()){
                System.out.print(", ");
            }
        }


    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q19_GradeReport.java
Priya : 92, Amit : 85 

 */