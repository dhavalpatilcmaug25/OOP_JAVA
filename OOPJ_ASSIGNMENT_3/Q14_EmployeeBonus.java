/*

14. Employee Bonus Calculation
Scenario: A company has different types of employees with specific bonus calculation rules.
Problem Statement:
Create an abstract class Employee with abstract method calculateBonus(). Subclass Manager →
bonus=20% of salary, Subclass Developer → bonus=10% of salary.
Classes/Fields:
● Employee → name, salary, calculateBonus() (abstract)
● Manager → bonus=20% of salary
● Developer → bonus=10% of salary
Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000
Sample Output:
Anita Bonus = 10000
Rohit Bonus = 4000

code:
*/


class Q14_EmployeeBonus{
	public static void main(String args[]){
		
		Employee e1 = new Manager("Anita", 50000);
		Employee e2 = new Developer("Rohit", 40000);
		
		System.out.println(e1.name + " Bonus = " + e1.calculateBonus());
		System.out.println(e2.name + " Bonus = " + e2.calculateBonus());
	}
}

abstract class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	abstract double calculateBonus();
}

class Manager extends Employee{
	
	Manager(String name, double salary){
		super(name, salary);
	}
	
	double calculateBonus(){
		return salary * 0.20;
	}
}

class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	
	double calculateBonus(){
		return salary * 0.10;
	}
}
	
	
/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q14_EmployeeBonus
Anita Bonus = 10000.0
Rohit Bonus = 4000.0
*/
