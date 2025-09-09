/*
3. Employee Age Validation
Scenario: HR wants to ensure employees entered in the system are adults.
Problem Statement:
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18.
Fields:
● private int age
Methods:
● setAge(int age) → if age >=18, set; else show error
● getAge() → returns age
Sample Input:
age = 17
Sample Output:
“Invalid age”
*/

class Q3_EmployeeAge{
	public static void main(String []args){
		Employee e1 = new Employee();
		e1.setAge(17);
		System.out.println("Age is " + e1.getAge());
	}
}

class Employee{
	private int age;
	
	public void setAge(int age){
		if(age>=18){
			this.age = age;
		}else{
			System.out.println("Invalid Age");
		}
	}
	
	public int getAge(){
		return age;
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q3_EmployeeAge
Invalid Age
*/