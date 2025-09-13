/*
Problem 17: Grade Distribution Counter
Use Case: Analyze the distribution of grades in a class.
Requirements:
● Count frequency of each grade
● Display grade distribution
● Handle multiple occurrences
Sample Input:
Grades: ["A", "B", "A", "C", "B", "A"]
Expected Output:
Grade Distribution: A=3, B=2, C=1


code : 
 */


import java.util.*;
public class Q17_GradeDistribution {
    public static void main(String[] args) {
        String[] Grades = {"A", "B", "A", "C", "B", "A"};

        HashMap<String, Integer> map = new HashMap<>();

        for(String Grade : Grades){
            map.put(Grade, map.getOrDefault(Grade, 0) + 1);
        }

        
        System.out.println("Grade Distribution: ");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q17_GradeDistribution.java
Grade Distribution:
A=3
B=2
C=1

 */