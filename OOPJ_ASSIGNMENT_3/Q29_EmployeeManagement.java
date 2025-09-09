/*

29. Employee Management System
Scenario: Manage employee details, calculate salaries, and differentiate employee types.
Problem Statement:
● Abstract Class Employee → instance variables: name, id
○ Abstract method calculateSalary() → different calculation for each type
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement
calculateSalary()
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked →
implement calculateSalary()
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible
Sample Input:
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100
Sample Output:
Amit Salary = 55000, Bonus = 5500
Neha Salary = 30000


code:
*/

class Q29_EmployeeManagement{
	public static void main(String args[]){
		PermanentEmployee e1 = new PermanentEmployee("Amit", 1, 50000, 5000);
		ContractEmployee e2 = new ContractEmployee("Neha", 3, 300, 100);
		
		Employee[] employee = {e1, e2};
		
		for (Employee emp : employee) {
            double salary = emp.calculateSalary();
            System.out.print(emp.name + " Salary = " + salary);
            if (emp instanceof BonusEligible) {
                double bonus = ((BonusEligible) emp).calculateBonus();
                System.out.print(", Bonus = " + bonus);
            }
            System.out.println();
        }
	}
}

abstract class Employee{
	String name;
	int id;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	abstract double calculateSalary();
	
	
}

interface BonusEligible{
	double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible{
	
	double basicSalary;
	double hra;
	
	PermanentEmployee(String name, int id, double basicSalary, double hra){
		super(name, id);
		this.basicSalary = basicSalary;
		this.hra = hra;
	}
	
	 double calculateSalary(){
		return basicSalary + hra;
	}
	
	public double calculateBonus(){
		return 0.10 * calculateSalary();
	}
}

class ContractEmployee extends Employee{
	int hourlyRate;
	int hoursWorked;
	
	ContractEmployee(String name, int id, int hourlyRate, int hoursWorked){
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	 double calculateSalary(){
		return hourlyRate * hoursWorked;
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q29_EmployeeManagement
Amit Salary = 55000.0, Bonus = 5500.0
Neha Salary = 30000.0

*/