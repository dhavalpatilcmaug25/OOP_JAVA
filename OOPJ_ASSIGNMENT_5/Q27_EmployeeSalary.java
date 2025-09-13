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
import java.lang.*;
 
class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee e){
		return this.salary - e.salary;
	}
	
	@Override
	public String toString(){
		return name + ":" + salary;
	}
	
}

public class Q27_EmployeeSalary{
	public static void main(String[] args){
		List<Employee> a = new ArrayList<>();
		
		a.add(new Employee("Amit", 50000));
		a.add(new Employee("Priya", 60000));
		a.add(new Employee("Rohan", 45000));
		
		Collections.sort(a);
		
		System.out.print("Employee List: " );
		
		Iterator<Employee> itr = a.iterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
	}
}

/*


C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q27_EmployeeSalary
Employee List: Rohan:45000 Amit:50000 Priya:60000

*/