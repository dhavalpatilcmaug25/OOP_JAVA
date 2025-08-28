/* 
12. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3



Code: 
*/


import java.util.*;
public class Q12_Oldest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int a = sc.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int b = sc.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int c = sc.nextInt();
        
        if(a > b && a > c){
            System.out.println("Oldest: Friend 1");
        }else if(b > c){
            System.out.println("Oldest: Friend 2");
        }else{
            System.out.println("Oldest: Friend 3");
        }

        //youngest
        if(a < b && a < c){
            System.out.println("Youngest: Friend 1");
        }else if(b < c){
            System.out.println("Youngest: Friend 2");
        }else{
            System.out.println("Youngest: Friend 3");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q12_Oldest.java
Enter age of Friend 1: 20
Enter age of Friend 2: 25
Enter age of Friend 3: 29
Oldest: Friend 3
Youngest: Friend 1

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q12_Oldest.java
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Oldest: Friend 2
Youngest: Friend 3
*/