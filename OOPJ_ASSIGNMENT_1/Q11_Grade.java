/* 
11. Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail
Input:
Enter percentage marks: 82
Output:
Grade: A



Code: 
*/


import java.util.*;
public class Q11_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage marks: ");
        int marks = sc.nextInt();
        
        if(marks >= 90){
            System.out.println("Grade: A+");
        }else if(marks >= 76 && marks <=89){
            System.out.println("Grade: A");
        }else if(marks >=66 && marks <= 75){
            System.out.println("Grade: B+");
        }else if(marks >= 51 && marks <=65){
            System.out.println("Grade: B");
        }else if(marks >= 36 && marks <= 50){
            System.out.println("Grade: C");
        }else{
            System.out.println("Grade: Fail");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q11_Grade.java
Enter percentage marks: 82
Grade: A

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q11_Grade.java
Enter percentage marks: 45
Grade: C
*/