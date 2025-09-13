/*
Problem 5: Recent Search History
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is
exceeded.
Requirements:
● Store recent searches (maximum 5)
● Remove oldest search when limit exceeded
● Maintain insertion order
Sample Input:
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring"
Expected Output:
Recent searches: Python, C++, DSA, OOP, Spring


code : 
 */


import java.util.*;
public class Q5_RecentSearch {
    public static void main(String[] args) {
        RecentSearch rs = new RecentSearch();

       String[] searches = {"Java", "Python", "C++", "DSA", "OOP", "String"};
        for(String search : searches){
            rs.addSearch(search);
        }

        rs.printRecentSearches();
    }
}

class RecentSearch{
    static final int Limit = 5;
    Queue<String> searchHistory;

    public RecentSearch(){
        searchHistory = new LinkedList<>();
    }

    public void addSearch(String search){
        if(searchHistory.size() == Limit){
            searchHistory.poll();
        }
        searchHistory.offer(search);
    }
    public void printRecentSearches(){
        System.out.println("Recent Searchs: " + String.join(", ", searchHistory));
    }
}


/*
Output:

ASSIGNMENT_5> java Q5_RecentSearch.java
Recent Searchs: Python, C++, DSA, OOP, String
 */

 