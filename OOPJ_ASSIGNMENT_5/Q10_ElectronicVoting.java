/*
Problem 10: Electronic Voting System
Use Case: Track unique voters in an election system to prevent duplicate voting.
Requirements:
● Record voter IDs
● Ensure one vote per voter
● Count total unique voters
Sample Input:
Voter IDs: 201, 202, 203, 202
Expected Output:
Total voters: 3



code : 
 */


import java.util.*;
public class Q10_ElectronicVoting {
    public static void main(String[] args) {
        int[] VoterId = {201, 202, 203, 202};

        Set<Integer> h1 = new HashSet<>();

        for(int n : VoterId){
            h1.add(n);
        }

        System.out.println("Total Voters: " + h1.size());
    }
}


/*
Output:

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5> java Q10_ElectronicVoting.java
Total Voters: 3
 */