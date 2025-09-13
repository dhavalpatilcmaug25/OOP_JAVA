/*
Problem 25: Command History Tracker
Use Case: Store recent commands in a terminal with limited history.
Requirements:
● Maintain last 3 commands
● Remove oldest when limit exceeded
● Display recent commands
Sample Input:
Commands: "ls", "pwd", "cd ..", "mkdir"
History limit: 3
Expected Output:
Recent Commands: pwd, cd .., mkdir


code:
*/

import java.util.*;
public class Q25_CommandHistory{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<>();
	
		int Limit = 3;
		String[] commands = {"ls", "pwd", "cd ..", "mkdir"};
		
		for(String cmd : commands){
			if(Limit == q.size()){
				q.poll();
			}
			q.add(cmd);
		}
		
		System.out.println("Recent Commands: " + String.join(", " , q));
	}
}


/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q25_CommandHistory
Recent Commands: pwd, cd .., mkdir
*/