/*

7. Employee Hierarchy
Scenario: A company has regular and contractual employees with different pay structures.
Problem Statement:
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%,
Subclass ContractEmployee adds allowance 5%. Display net salary.
Classes/Fields:
● Employee → name, basicSalary
● RegularEmployee → HRA 10%
● ContractEmployee → allowance 5%
Sample Input:
Regular → name=Rahul, basicSalary=20000
Contract → name=Riya, basicSalary=15000
Sample Output:
Rahul Net Salary = 22000
Riya Net Salary = 15750



code:
*/

class Q7_EmployeeHierarchy{
	public static void main(String[] args){
		RegularEmployee r1 = new RegularEmployee("Rahul", 20000);
		ContractEmployee c1 = new ContractEmployee("Riya", 15000);
		
		r1.displayNetSalary();
		c1.displayNetSalary();
	}
}

class Employee{
	String name;
	double basicSalary;
	
	Employee(String name, double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	double getNetSalary(){
		return basicSalary;
	}
	
	void displayNetSalary(){
		System.out.println(name + " Net Salary = " + getNetSalary());
	}
}

class RegularEmployee extends Employee{
	RegularEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	double getNetSalary(){
		double hra = basicSalary * 0.10;
		return basicSalary + hra;
	}
	
}

class ContractEmployee extends Employee{
	
	ContractEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	double getNetSalary(){
		double allowance = basicSalary * 0.05;
		return basicSalary + allowance;
	}
	
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q7_EmployeeHierarchy
Rahul Net Salary = 22000.0
Riya Net Salary = 15750.0
*/