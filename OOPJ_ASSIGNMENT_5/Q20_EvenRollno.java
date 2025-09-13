/*
Problem 20: Even Roll Number Filter
Use Case: Filter and display only students with even roll numbers.
Requirements:
● Process list of roll numbers
● Remove odd roll numbers
● Display filtered results
Sample Input:
Roll numbers: 101, 102, 103, 104
Expected Output:
Even Roll Numbers: 102, 104


code : 
 */


import java.util.*;
public class Q20_EvenRollno {
    public static void main(String[] args) {
        int[] Rollno = {101, 102, 103, 104};
        ArrayList<Integer> a = new ArrayList<>();

        for(int roll : Rollno){
            a.add(roll);
        }
        
        ArrayList<Integer> even = new ArrayList<>();
        for(int ar : a){
            if(ar % 2 == 0){
                even.add(ar);
            }
        }

        System.out.print("Even Roll Numbers: ");
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i));
            if (i < even.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}


/*
Output:

Even Roll Numbers: 102, 104

 */