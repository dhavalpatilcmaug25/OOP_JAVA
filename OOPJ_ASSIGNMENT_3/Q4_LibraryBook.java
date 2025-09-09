/*

4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it
directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
Fields:
● private int copiesAvailable
Methods:
● addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
Sample Input:
add 3 copies, remove 1 copy
Sample Output:
Copies available = 2


code:
*/

class Q4_LibraryBook{
	public static void main(String args[]){
		Book b1 = new Book();
		b1.addCopies(3);
		b1.removeCopies(1);
		
		System.out.println("Copies avavilable = " + b1.getCopiesAvailable());
	}
}

class Book{
	private int copiesAvailable;
	
	public void addCopies(int n){
		copiesAvailable += n;
	}
	
	public void removeCopies(int n){
		copiesAvailable -= n;
	}
	
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
	
	/*
	C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q4_LibraryBook
Copies avavilable = 2
	*/
}