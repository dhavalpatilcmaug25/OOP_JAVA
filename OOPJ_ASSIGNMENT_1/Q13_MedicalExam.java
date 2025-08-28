/* 
13. Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam.



Code: 
*/


import java.util.*;
public class Q13_MedicalExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classes held: ");
        int held = sc.nextInt();
        System.out.print("Classes attended: ");
        int attended = sc.nextInt();
        System.out.print("Medical cause (Y/N): ");
        char medicalCause = sc.next().charAt(0);
        
        double attendance = (attended * 100.0) / held;
        if (attendance >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

    }
}

/*
Output :

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q13_MedicalExam.java
Classes held: 100
Classes attended: 22
Medical cause (Y/N): Y
Student is allowed to sit for the exam.

PS C:\Users\Niraj\Desktop\OOPJ_ASSIGNMENT_1> java Q13_MedicalExam.java
Classes held: 100
Classes attended: 60
Medical cause (Y/N): N
Student is NOT allowed to sit for the exam.
*/