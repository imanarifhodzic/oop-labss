package MidtermPractice.TaskThree;

import java.util.List;

public record Book(int bookId, String title, String author, double price) {}

class Bookstore {
    public double calculateTotalBookCost(List<Book> books) {
        if (books == null || books.isEmpty()) {
            return 0.0; // Return 0 if the list is empty or null
        }

        double totalCost = 0.0;

        for (Book book : books) {
            totalCost += book.price();
        }

        return totalCost;
    }
}

class Main {
    public static void main(String[] args) {
        // Creating some sample books
        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee", 15.99);
        Book book2 = new Book(2, "1984", "George Orwell", 12.50);
        Book book3 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 10.75);
        Book book4 = new Book(4, "Pride and Prejudice", "Jane Austen", 8.99);

        // Creating a list of books
        List<Book> bookList = List.of(book1, book2, book3, book4);

        // Creating an instance of Bookstore
        Bookstore bookstore = new Bookstore();

        // Calculating the total cost of books
        double totalBookCost = bookstore.calculateTotalBookCost(bookList);

        // Displaying the total cost
        System.out.println("Total Book Cost: $" + totalBookCost);
    }
}

