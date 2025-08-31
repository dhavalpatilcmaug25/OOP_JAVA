/*
Problem 15: Employee Auto-ID Generator
Scenario:
Create Employee class with id, name, basicSalary.
● Add static counter starting from 1001 for IDs.
● Default constructor → name = "Unknown", salary = 20000
● Parameterized constructor → accept name and salary
● Getter for all variables
● Create 2 employees and display their IDs, names, salary.

 */

package OOPJ_ASSIGNMENT_2;

public class P15_EmployeeAutoID {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Dhaval", 40000);

        System.out.println("Employee1: ID: " + e1.getID() + " Name: " + e1.getName() + " Salary: " + e1.getSalary());
        System.out.println("Employee2: ID: " + e2.getID() + " Name: " + e2.getName() + " Salary: " + e2.getSalary());

    }
}

class Employee{
    private int id;
    private String name;
    private double basicSalary;
    static int counter = 1001;

    Employee(){
        this.id = counter++;
        name = "Unknown";
        basicSalary = 20000;
    }

    Employee(String name, double basicSalary){
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return basicSalary;
    }

}


/*
PS C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_2> java P15_EmployeeAutoID.java
Employee1: ID: 1001 Name: Unknown Salary: 20000.0
Employee2: ID: 1002 Name: Dhaval Salary: 40000.0 
 */