/* 
10. Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance.
Input:
Enter total classes held: 100
Enter classes attended: 78
Output:
Student is allowed to sit for the exam.



Code: 
*/


import java.util.*;
public class Q10_Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalclass = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attend = sc.nextInt();
        
        int attendance = (attend * 100) / totalclass;
        if(attendance >= 75){
            System.out.println("Student is allowed to sit for the exam.");
        }
        else{
            System.out.println("Student is not allowed to sit for the exam.");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q10_Attendance.java
Enter total classes held: 100
Enter classes attended: 78
Student is allowed to sit for the exam.

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q10_Attendance.java
Enter total classes held: 120
Enter classes attended: 78
Student is not allowed to sit for the exam.
*/