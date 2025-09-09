/*

20. College Staff Hierarchy
Scenario: A college has employees who can be Teaching or Non-Teaching. Teaching staff can be
Professors or Lecturers.
Problem Statement:
Create classes:
● Employee → name, salary, displaySalary()
● TeachingStaff → subject, overrides displaySalary()
● Professor → specialization, overrides displaySalary()
● Lecturer → department, overrides displaySalary()
Sample Input:
Professor → name=Dr. Sharma, salary=80000, subject=Math, specialization=Algebra
Lecturer → name=Ms. Mehta, salary=50000, subject=Physics, department=Science
Sample Output:
Dr. Sharma → Subject=Math, Specialization=Algebra, Salary=80000
Ms. Mehta → Subject=Physics, Department=Science, Salary=50000


code:
*/


class Q20_CollegeStaff{
	public static void main(String args[]){
		Professor p = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer l = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        p.displaySalary();
        l.displaySalary();
	}
}

class Employee{
	String name;
	int salary;
	
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	void displaySalary(){
		System.out.println("Salary= " + salary);
	}
}

class TeachingStaff extends Employee{
	String subject;
	
	TeachingStaff(String name, int salary, String subject){
		super(name, salary);
		this.subject = subject;
	}
	
	void displaySalary() {
        System.out.println(name + " Subject = " + subject + ", Salary = " + salary);
    }
}

class Professor extends TeachingStaff{
	String specialization;
	
	Professor(String name, int salary, String subject, String specialization){
		super(name, salary, subject);
		this.specialization = specialization;
	}
	
	void displaySalary() {
        System.out.println(name + " Subject = " + subject + ", Specialization=" + specialization + ", Salary = " + salary);
    }
	
}

class Lecturer extends TeachingStaff{
	String department;
	
	Lecturer(String name, int salary, String subject, String department){
		super(name, salary, subject);
		this.department = department;
	}
	
	void displaySalary() {
        System.out.println(name + " Subject = " + subject + ", Department= " + department + ", Salary = " + salary);
    }
	
}

/*

Dr. Sharma Subject = Math, Specialization=Algebra, Salary = 80000
Ms. Mehta Subject = Physics, Department= Science, Salary = 50000

*/