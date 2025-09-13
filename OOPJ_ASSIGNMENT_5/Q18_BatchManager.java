/*
Problem 18: Batch Merger System
Use Case: Merge student lists from morning and evening batches, removing duplicates.
Requirements:
● Combine two student lists
● Remove duplicate students
● Maintain unique student list
Sample Input:
Morning batch: "Amit", "Priya"
Evening batch: "Rohan", "Priya"
Expected Output:
Combined batches: Amit, Priya, Rohan


code : 
 */


import java.util.*;
public class Q18_BatchManager {
    public static void main(String[] args) {
        String[] Morning = {"Amit", "Priya"};
        String[] Evening = {"Rohan", "Priya"};

        Set<String> set = new LinkedHashSet<>();

        set.addAll(Arrays.asList(Morning));
        set.addAll(Arrays.asList(Evening));
    
        
        System.out.print("Combined batches: ");
        
            System.out.print(String.join(", ", set));


    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q18_BatchManager.java
Combined batches: Amit, Priya, Rohan

 */