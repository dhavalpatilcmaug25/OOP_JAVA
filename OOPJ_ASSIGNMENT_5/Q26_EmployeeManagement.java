/*
Problem 26: Employee Management System
Use Case: Manage employee information including name and salary.
Requirements:
● Create Employee objects with name and salary
● Store employees in a collection
● Display employee information
Sample Input:
Employees: Employee("Amit", 50000), Employee("Priya", 60000)
Expected Output:
Employee List: Amit:50000, Priya:60000

code : 
 */


import java.util.*;
 
class Employee{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return name + ":" + salary;
	}
}

public class Q26_EmployeeManagement{
	public static void main(String[] args){
		List<Employee> a = new ArrayList<>();
		
		a.add(new Employee("Amit", 50000));
		a.add(new Employee("Amit", 60000));
		System.out.print("Employee List: " );
		for(int i=0; i<a.size(); i++){
			System.out.print(a.get(i));
			if(i < a.size()-1){
				System.out.print(", ");
			}
		}
	}
}

/*


C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q26_EmployeeManagement
Employee List: Amit:50000, Amit:60000

*/