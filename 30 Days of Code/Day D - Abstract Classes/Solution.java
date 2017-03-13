import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
    // Declare the price instance variable
    private int bookPrice;

    /**   
        *   Class Constructor
        *   
        *   @param title The book's title.
        *   @param author The book's author.
        *   @param price The book's price.
        **/
    MyBook(String title, String author, int price) {
        super(title, author);
        this.bookPrice = price;
    }

    /**   
        *   Method Name: display
        *   
        *   Print the title, author, and price in the specified format.
        **/
    public void display() {
        System.out.println(String.format("Title: %s", title));
        System.out.println(String.format("Author: %s", author));
        System.out.println(String.format("Price: %d", this.bookPrice));
    }
}

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}