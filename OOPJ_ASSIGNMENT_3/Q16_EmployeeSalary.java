/*

16. Employee Salary Display
Scenario: Company wants to display employee salary with different bonus calculations based on
employee type.
Problem Statement:
Create class Employee with method displaySalary(). Subclass Manager and Developer override
displaySalary() to include bonus.
Classes/Fields:
● Employee → name, salary, displaySalary() prints salary
● Manager → overrides displaySalary() → adds 20% bonus
● Developer → overrides displaySalary() → adds 10% bonus
Sample Input:
Manager → name=Anita, salary=50000
Developer → name=Rohit, salary=40000
Sample Output:
Anita Total Salary = 60000
Rohit Total Salary = 44000

code:
*/


class Q16_EmployeeSalary{
	public static void main(String args[]){
		Employee e1 = new Manager("Anita", 50000);
		Employee e2 = new Developer("Rohit", 40000);
		
		e1.displaySalary();
		e2.displaySalary();
		
	}
}

class Employee{
	String name;
	double salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	void displaySalary(){
		System.out.println(name + " Total Salary = " + salary);
	}
}

class Manager extends Employee{
	
	Manager(String name, int salary){
		super(name, salary);
	}
	
	void displaySalary(){
		double bonus =salary + (salary * 0.20);
		System.out.println(name + " Total Salary = " + bonus);
	}
}

class Developer extends Employee{
	
	Developer(String name, int salary){
		super(name, salary);
	}
	
	void displaySalary(){
		double bonus =salary + (salary * 0.10);
		System.out.println(name + " Total Salary = " + bonus);
	}
}
	
	
	/*
	Output: 
	
Anita Total Salary = 60000.0
Rohit Total Salary = 44000.0

	*/