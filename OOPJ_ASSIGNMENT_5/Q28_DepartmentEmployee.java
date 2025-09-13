/*
Problem 28: Department Employee Mapping
Use Case: Organize employees by department for HR management.
Requirements:
● Map departments to employee lists
● Group employees by department
● Display departmental structure
Sample Input:
Department mapping: "IT" → ["Amit", "Rohan"], "HR" → ["Priya"]
Expected Output:
Department Structure: IT: Amit, Rohan; HR: Priya


code : 
 */

import java.util.*;

public class Q28_DepartmentEmployee{
	public static void main(String[] args){
		HashMap<String, List<String>> map = new HashMap<>();
		
		map.put("IT", Arrays.asList("Amit", "Rohan"));
		map.put("HR", Arrays.asList("Priya"));
		int c = 0;
		System.out.print("Deparment Structure: ");
		for(Map.Entry<String, List<String>> entry : map.entrySet()){
			System.out.print(entry.getKey() + ": " + String.join(", ", entry.getValue()));
			c++;
			if(c < map.size()){
				System.out.print("; ");
			}
		}
	}
}



/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q28_DepartmentEmployee
Deparment Structure: HR: Priya; IT: Amit, Rohan
*/