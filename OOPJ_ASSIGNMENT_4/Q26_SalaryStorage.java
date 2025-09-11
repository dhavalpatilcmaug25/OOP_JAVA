/*
Problem 26: Salary Storage
Scenario: A financial system needs to convert primitive double salary values to Double objects for
storage in collections and database operations.
Task: Use valueOf method to convert primitives to wrapper objects.
Sample Input:
45000.5
Expected Output:
Double object: 45000.5

*/

public class Q26_SalaryStorage {
    
    public static void main(String[] args) {

        double a = 45000.5;
        Double b = Double.valueOf(a);

        System.out.println("Double object: " + b);
    }
}


/* 

PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_4> java q25_PaymentProcess.java
Amount as string: 1000
Additional amount to add: 500
1000 + 500 = 1500
 */