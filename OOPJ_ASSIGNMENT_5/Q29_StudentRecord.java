/*
Problem 29: Student Record System
Use Case: Maintain student records with name and grade information.
Requirements:
● Create Student objects with name and grade
● Store in a collection
● Display student records
Sample Input:
Students: Student("Amit", "A"), Student("Priya", "B")
Expected Output:
Student Records: Amit:A, Priya:B


code : 
 */

import java.util.*;

class Student{
	String name;
	String grade;
	
	Student(String name, String grade){
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString(){
		return name + ":" + grade;
	}

}

public class Q29_StudentRecord{
	public static void main(String[] args){
		List<Student> l1 = new ArrayList<>();
		
		l1.add(new Student("Amit", "A"));
		l1.add(new Student("Priya", "B"));
		
		int c = 0;
		System.out.print("Student Records: ");
		for(Student s : l1){
			System.out.print(s);
			if(++c < l1.size()){
				System.out.print(", ");
			}
		}
	}
}



/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q29_StudentRecord
Student Records: Amit:A, Priya:B
*/