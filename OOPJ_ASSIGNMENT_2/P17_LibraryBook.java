/*
Problem 17: Library Book Addition
Scenario:
Create Book class with bookId, title, author.
● Constructor + Getters/Setters
● Create Library class with libraryName and static totalBooks
● Method addBook(Book b) → increments totalBooks
● Method displayTotalBooks() → prints totalBooks
● Add 2 books to library and display total books


 */

package OOPJ_ASSIGNMENT_2;

public class P17_LibraryBook {
    public static void main(String[] args) {
        Library l1 = new Library("Library1");

        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");

        System.out.println(b1.getBookID() + ", " + b1.getTitle() + ", " + b1.getAuthor());
        System.out.println(b2.getBookID() + ", " + b2.getTitle() + ", " + b2.getAuthor());
        l1.addBook(b1);
        l1.addBook(b2);

        l1.displayTotalBooks();

    }
}

class Book{
    private int bookId;
    private String title;
    private String author;
    static int counter = 101;

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.bookId = counter++;
    }

    public int getBookID(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

}

class Library{
    String libraryName;
    static int totalBooks = 0;

    Library(String libraryName){
        this.libraryName = libraryName;
    }

    public void addBook(Book b){
        totalBooks++;
    }

    public void displayTotalBooks(){
        System.out.println("Total Books: "+totalBooks);
    }

}


/*

101, The Alchemist, Paulo Coelho
102, 1984, George Orwell
Total Books: 2
 */