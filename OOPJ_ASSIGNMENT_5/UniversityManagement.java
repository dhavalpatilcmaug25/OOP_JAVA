/*
Create a University Student Management System using Java Collections to manage students across
departments.
● Roll Number (int)
● Name (String)
● Department (String)
● CGPA (double)
Requirements
1. Registration List - ArrayList<Student>
● Store students in registration order
2. Merit List - Comparable<Student>
● Sort by CGPA (descending order)
3. Alphabetical List - Comparator<Student>
● Sort by name (A to Z)
4. Department Grouping - HashMap<String, List<Student>>
● Group students by department
5. Unique Names - HashSet<String>
● Track unique student names
6. Roll Number Sorting - TreeSet<Student>
● Auto-sort by roll number
7. Performance Filter - Iterator
● Remove students with CGPA < 5.0
8. Recent Registrations - Stack<Student>
● Track last added students (LIFO)
9. Scholarship Queue - Queue<Student>
● Process students for scholarships (FIFO)
10. Hostel Applications - LinkedList<Integer>
● Add priority applicants at front
● Add regular applicants at end
● Remove from both ends for allocation
Sample Data
Student s1 = new Student(101, "Amit", "CS", 8.5);
Student s2 = new Student(102, "Priya", "Math", 9.2);
Student s3 = new Student(103, "Rohan", "CS", 7.8);
Student s4 = new Student(104, "Sneha", "Physics", 4.5);
Expected Outputs
Registration Order: Amit, Priya, Rohan, Sneha
Merit List: Priya(9.2), Amit(8.5), Rohan(7.8), Sneha(4.5)
Alphabetical: Amit, Priya, Rohan, Sneha
Department Groups:
CS: [Amit, Rohan]
Math: [Priya]
Physics: [Sneha]
After Filter (CGPA >= 5.0): Amit, Priya, Rohan
Hostel Queue:
Add regular(105): [105]
Add priority(101): [101, 105]
Remove front: [105]




code : 
 */
import java.util.*;

class Student implements Comparable<Student>{
	int roll;
	String name;
	String department;
	double cgpa;
	
	Student(int roll, String name, String department, double cgpa){
		this.roll = roll;
		this.name = name;
		this.department = department;
		this.cgpa = cgpa;
	}
	
	@Override
	public int compareTo(Student s){
		return Double.compare(s.cgpa, this.cgpa);
	}
	
	@Override
	public String toString(){
		return name + "(" + cgpa + ")";
	}
}

class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class SortByRoll implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2){
		return s1.roll - s2.roll;
	}
}



 
public class UniversityManagement{
	public static void main(String args[]){
		Student s1 = new Student(101, "Amit", "CS", 8.5);
		Student s2 = new Student(102, "Priya", "Math", 9.2);
		Student s3 = new Student(103, "Rohan", "CS", 7.8);
		Student s4 = new Student(104, "Sneha", "Physics", 4.5);
		
		ArrayList<Student> a = new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		
		System.out.print("Registration Order: ");
		int b = 0;
		for(Student s : a){
			System.out.print(s.name);
			if(++b < a.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
		
		System.out.print("Merit List: ");
		Collections.sort(a);
		int c = 0;
		for(Student s : a){
			System.out.print(s);
			if(++c < a.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.print("Alphabetical: ");
		Collections.sort(a, new SortByName());
		int c3 = 0;
		for(Student s : a){
			System.out.print(s.name);
			if(++c3 < a.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
		System.out.println("Department Groups");
		HashMap<String, List<Student>> map = new HashMap<>();
		
		for(Student s : a){
			if(map.containsKey(s.department)){
				map.get(s.department).add(s);
			}else{
				List<Student> l1 = new ArrayList<>();
				l1.add(s);
				map.put(s.department, l1);
			}
		}
		
		for(String dept : map.keySet()){
			System.out.print(dept + ": ");
			for(Student s : map.get(dept)){
				System.out.print(s.name + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("Unique Names: ");
		HashSet<String> set = new HashSet<>();
	
		for(Student s : a){
			set.add(s.name);
		}
		int c4 = 0;
		for(String s : set){
			System.out.print(s);
			if(++c4 < set.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
		
		System.out.print("Roll Number Sorting: ");
		TreeSet<Student> t1 = new TreeSet<>();
		
		int c5 = 0;
		for(Student s : a){
			System.out.print(s.name);
			if(++c5 < set.size()){
				System.out.print(", ");
			}
		}
		System.out.println();
		
		
		System.out.print("After Filter (CGPA >= 5.0): ");
		 ArrayList<Student> filterList = new ArrayList<>(a);
		Iterator<Student> itr = filterList.iterator();
		while(itr.hasNext()){
			Student s = itr.next();
			if(s.cgpa <= 5.0){
				itr.remove();
			}
		}
		
		for(int i=0; i<filterList.size(); i++){
			System.out.print(filterList.get(i).name);
			if (i < filterList.size() - 1) System.out.print(", ");
		}
		System.out.println();
		
		
		System.out.print("Recent Registration: ");
		Stack<Student> recentStack = new Stack<>();
        for (Student s : a) recentStack.push(s);
        while (!recentStack.isEmpty()) {
            System.out.print(recentStack.pop().name + " ");
        }
        System.out.println();
		
		
		Queue<Student> scholarship = new LinkedList<>(a);
        System.out.print("Scholarship Queue (FIFO): ");
        while (!scholarship.isEmpty()) {
            System.out.print(scholarship.poll().name + " ");
        }
        System.out.println();

		
		System.out.println("Hostel Queue: ");
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(105);
		System.out.println("Add Regular(105)" + list);
		list.addFirst(101);
		System.out.println("Add Priority(101)" + list);
		list.removeFirst();
		System.out.println("Remove" + list);
		list.removeLast();
		System.out.println("Remove" + list);
	}
}

/*

OutPut: 


Registration Order: Amit, Priya, Rohan, Sneha
Merit List: Priya(9.2), Amit(8.5), Rohan(7.8), Sneha(4.5)
Alphabetical: Amit, Priya, Rohan, Sneha
Department Groups
CS: Amit Rohan
Math: Priya
Physics: Sneha

Unique Names: Priya, Sneha, Amit, Rohan
Roll Number Sorting: Amit, Priya, Rohan, Sneha
After Filter (CGPA >= 5.0): Amit, Priya, Rohan
Recent Registration: Sneha Rohan Priya Amit
Scholarship Queue (FIFO): Amit Priya Rohan Sneha
Hostel Queue:
Add Regular(105)[105]
Add Priority(101)[101, 105]
Remove[105]
Remove[]
*/