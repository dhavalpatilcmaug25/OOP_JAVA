/*
Problem 30: Grade-Based Student Filter
Use Case: Filter students based on minimum grade requirements.
Requirements:
● Store student objects with grades
● Remove students below grade B
● Display filtered results
Sample Input:
Students: ("Amit", "A"), ("Priya", "C"), ("Rohan", "B")
Filter: Grade >= B
Expected Output:
Qualified Students: Amit:A, Rohan:B



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

public class Q30_GradeFilter{
	public static void main(String[] args){
		List<Student> l1 = new ArrayList<>();
		
		l1.add(new Student("Amit", "A"));
		l1.add(new Student("Priya", "C"));
		l1.add(new Student("Rohan", "B"));
		
		Iterator<Student> itr= l1.iterator();
		while(itr.hasNext()){
			Student s = itr.next();
			if(s.grade.compareTo("B") > 0){
				itr.remove();
			}
		}
		
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
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q30_GradeFilter
Student Records: Amit:A, Rohan:B
*/