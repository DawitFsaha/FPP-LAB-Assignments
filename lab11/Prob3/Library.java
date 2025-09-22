package lab11.Prob3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " already exists in the library.");
        } else {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book added: " + title + " by " + author);
        }
    }

    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in the library.");
        } else if (book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " is already borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println("You have successfully borrowed: " + book);
        }
    }

    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in the library.");
        } else if (!book.isBorrowed()) {
            System.out.println("Book with ISBN " + ISBN + " was not borrowed.");
        } else {
            book.setBorrowed(false);
            System.out.println("You have successfully returned: " + book);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
            return false;
        }
        return book.isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        return books.get(ISBN);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("All books in the library:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    public void listBorrowedBooks() {
        boolean found = false;
        System.out.println("Borrowed books:");
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books are currently borrowed.");
        }
    }
}
