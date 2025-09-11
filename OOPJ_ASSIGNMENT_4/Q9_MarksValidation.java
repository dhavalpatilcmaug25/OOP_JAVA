/*
Problem 9: Marks Validation
Scenario: An online examination system needs to validate that marks entered by teachers are within valid
range (0-100). Negative marks should not be allowed.
Task: Create a marks validation method that throws an exception for invalid marks.
Sample Input:
-5
Expected Output:
Invalid marks


 */

import java.util.*;
public class Q9_MarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        try {
            if(marks  < 0){
                throw new Exception("Invalid marks");
            }

            System.out.println("Marks is " + marks);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}


/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q9_MarksValidation.java
5
Marks is 5
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q9_MarksValidation.java
-5
Invalid marks

 */