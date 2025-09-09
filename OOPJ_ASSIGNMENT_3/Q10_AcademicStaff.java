/*

10. Academic Staff
Scenario: University has teaching and non-teaching staff.
Problem Statement:
Superclass Staff with name, salary. Subclass TeachingStaff adds subject, Subclass NonTeachingStaff
adds department. Display staff info.
Classes/Fields:
● Staff → name, salary
● TeachingStaff → subject
● NonTeachingStaff → department
Sample Input:
Teaching → name=Anita, salary=50000, subject=Math
NonTeaching → name=Ramesh, salary=40000, department=Admin
Sample Output:
Anita → Math, 50000
Ramesh → Admin, 40000


code:
*/

class Q10_AcademicStaff{
	public static void main(String args[]){
		TeachingStaff t1 = new TeachingStaff("Anita", 50000, "Math");
		NonTeachingStaff n1 = new NonTeachingStaff("Ramesh", 40000, "Admin");
		
		t1.displayDetails();
		n1.displayDetails();
	}
}

class Staff{
	String name;
	int salary;
	
	Staff(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
}

class TeachingStaff extends Staff{
	String subject;
	
	TeachingStaff(String name, int salary, String subject){
		super(name, salary);
		this.subject = subject;
	}
	
	void displayDetails(){
		System.out.println(name + " ---> " + subject + ", " + salary);
	}
}

class NonTeachingStaff extends Staff{
	String department;
	
	NonTeachingStaff(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	void displayDetails(){
		System.out.println(name + " ---> " + department + ", " + salary);
	}
	
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q10_AcademicStaff
Anita ---> Math, 50000
Ramesh ---> Admin, 40000

*/