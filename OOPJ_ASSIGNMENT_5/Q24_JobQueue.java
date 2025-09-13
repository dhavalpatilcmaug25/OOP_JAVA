/*
Problem 24: Print Job Queue Manager
Use Case: Manage print jobs in a shared printer system.
Requirements:
● Queue print jobs
● Process jobs in order
● Display job status
Sample Input:
Jobs: "Doc1", "Doc2", "Doc3"
Process: 1 job
Expected Output:
Printing Doc1, Queue: Doc2, Doc3


code: 
*/


import java.util.*;

public class Q24_JobQueue{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<>();
		
		q.add("Doc1");
		q.add("Doc2");
		q.add("Doc3");
		
		int process = 1;
		
		String printing = null;
		
		for(int i=0; i<process; i++){
			printing = q.poll();
		}
		
		System.out.print("Printing " + printing + ", Queue:" );
		System.out.println(String.join(", " , q));
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q24_JobQueue
Printing Doc1, Queue:Doc2, Doc3
*/