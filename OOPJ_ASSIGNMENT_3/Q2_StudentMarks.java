/*
2. Student Marks
Scenario: A teacher wants to update student marks but must ensure marks are valid.
Problem Statement:
Create a class Student with private marks. Create getter and setter with validation (0–100).
Fields:
● private int marks
Methods:
● setMarks(int marks) → validate and set
● getMarks() → return marks
Sample Input:
marks = 85
Sample Output:
Marks = 85
*/

import java.util.*;

class Q2_StudentMarks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		int m = sc.nextInt();
		s1.setMarks(m);
		
		System.out.println("Marks = " + s1.getMarks());
		
	}
}

class Student{
	private int marks;
	
	public void setMarks(int marks){
		if(marks >= 0 && marks <= 100){
			this.marks = marks;
		}
	}
	
	public int getMarks(){
		return marks;
	}
}


/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q2_StudentMarks
86
Marks = 86
*/