/*
Problem 4: Employee Data
Scenario: An HR system needs to calculate hourly wage by dividing an employee's salary by working
hours. The system must handle both invalid employee indices and division by zero.
Task: Create a method with nested try-catch blocks to handle multiple exception scenarios.
Sample Input:
2
5000 6000
0
5
Expected Output:
Division by zero
or
Invalid index


 */

 import java.util.*;
public class Q4_EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salaries = new int[n];
        
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int hours = sc.nextInt();

        try {
            int salary = salaries[index];

            try {
                int w = salary / hours;
                System.out.println("Hourly wage: " + w);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}

/* 
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java Q4_EmployeeData.java
2
5000 6000
5
0
Invalid index
 */