/*
Problem 23: Browser History Management
Use Case: Maintain browser history with back functionality.
Requirements:
● Store visited pages
● Implement back navigation (LIFO)
● Display current history
Sample Input:
Pages visited: "Google", "YouTube", "GFG"
Action: Back (1 page)
Expected Output:
Current history: Google, YouTube

code:
*/

import java.util.Stack;
public class Q23_BrowserHistory{
	public static void main(String[] args){
		Stack<String> st = new Stack<>();
		
		String Pages[] = {"Google", "Youtube", "GFG"};
		
		for(String p : Pages){
			st.push(p);
		}
		
		String Action = "Back";
		
		if(Action == "Back"){
			st.pop();
		}
		
		System.out.print(String.join(", " , st));
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_5>java Q23_BrowserHistory
Google, Youtube
*/