/*
Problem 16: Grade-Based Student Filter
Use Case: Remove students with failing grades from the honor roll.
Requirements:
● Store student grades in a map
● Remove students with marks below 60
● Display remaining student
Sample Input:
Student grades: "Amit" → 85, "Priya" → 52, "Rohan" → 78
Filter threshold: 60
Expected Output:
Honor Roll: Amit:85, Rohan:78

code : 
 */


import java.util.*;
public class Q16_GradeBased {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amit" , 85);
        map.put("Priya" , 52);
        map.put("Rohan" , 78);

        int threshold = 60;

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            if(entry.getValue() < threshold){
                itr.remove();
            }
        }

        
        System.out.println("Honor Roll: ");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q16_GradeDistribution.java
Honor Roll: 
Amit 85
Rohan 78

 */