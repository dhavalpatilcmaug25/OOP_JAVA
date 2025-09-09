/*

30. Library Management System
Scenario: Manage books and library members with borrowing functionality.
Problem Statement:
● Class Book → private variables: bookId, title, author (Encapsulation)
● Abstract Class LibraryMember → instance variables: memberId, name
○ Abstract method borrowBook(Book book)
● Class StudentMember extends LibraryMember → limit 3 books
● Class FacultyMember extends LibraryMember → limit 5 books
● Interface Notifyable → method sendNotification(String message) → notify members about
overdue books
● In main(), create 1 student and 1 faculty, borrow books, send notifications
Sample Input:
Student → borrow 2 books
Faculty → borrow 4 books
Sample Output:
StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days

code:
*/


class Q30_Library{
	public static void main(String []args){
		Book b1 = new Book(101, "Java Basics", "Author A");
        Book b2 = new Book(102, "OOP Concepts", "Author B");
        Book b3 = new Book(103, "Data Structures", "Author C");
        Book b4 = new Book(104, "Operating Systems", "Author D");
        Book b5 = new Book(105, "Database Systems", "Author E");
		
		StudentMember student = new StudentMember(1, "Amit");
        FacultyMember faculty = new FacultyMember(2, "Prof. Singh");
		
		student.borrowBook(b1);
        student.borrowBook(b2);
		
		faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);
		
		System.out.println("StudentMember " + student.name + " borrowed " + student.borrowedBooks.size() + " books");
        System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.borrowedBooks.size() + " books");

        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
	}
}

class Book{
	private int bookId;
	private String title;
	private String author;
	
	Book(int bookId, String title, String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	public int getBookId(){
		return bookId;
	}
	
	public int getTitle(){
		return title;
	}
	
	public int getAuthor(){
		return author;
	}
}

abstract class LibraryMember{
	int memberId;
	String name;
	List<Book> borrowedBooks = new ArrayList<>();
	
	LibraryMember(int memberId, String name){
		this.memberId = memberId;
		this.name = name;
	}
	
	abstract void borrowBook(Book book);
}

interface Notifyable {
    void sendNotification(String message);
}

class StudentMember extends LibraryMember implements Notifyable{
	private static final LimitMAX = 3;
	
	 public StudentMember(int memberId, String name) {
        super(memberId, name);
	
	void borrowBook(Book book){
		if(borrowBook.size() < LimitMax){
			borrowedBooks.add(book);
		}
		else{
			System.out.println("Student " + name + " has reached the borrowing limit.");
		}
	}
	
	public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember implements Notifyable {
    private static final int LIMIT = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }
	
	void borrowBook(Book book) {
        if (borrowedBooks.size() < LIMIT) {
            borrowedBooks.add(book);
        } else {
            System.out.println("Faculty " + name + " has reached the borrowing limit.");
        }
    }
	
	public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

/*

StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days

*/