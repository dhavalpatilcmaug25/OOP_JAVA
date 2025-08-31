/*
Problem 16: Employee Net Salary
Scenario:
Extend previous problem. Add method calculateNetSalary():
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
● Print net salary for 2 employees

 */

package OOPJ_ASSIGNMENT_2;

public class P16_NetSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Dhaval", 40000);

        System.out.println("Employee1: ID: " + e1.getID() + " Name: " + e1.getName() + " Salary: " + e1.getSalary());
        System.out.println("Employee2: ID: " + e2.getID() + " Name: " + e2.getName() + " Salary: " + e2.getSalary());
        
        e1.calculateNetSalary();
        e2.calculateNetSalary();

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

    public void calculateNetSalary(){
        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.05;
        double pf = basicSalary * 0.02;
        basicSalary = basicSalary + hra + da - pf;
        System.out.println("net salary of " + name + " is "+basicSalary);
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
Employee1: ID: 1001 Name: Unknown Salary: 20000.0
Employee2: ID: 1002 Name: Dhaval Salary: 40000.0
net salary of Unknown is 22600.0
net salary of Dhaval is 45200.0
 */