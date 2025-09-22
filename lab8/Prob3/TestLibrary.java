package lab8.Prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        System.out.println("========== Add Books ===========");

        // Add some books
        lib.addBook("111", "The Hobbit", "J.R.R. Tolkien");
        lib.addBook("222", "1984", "George Orwell");
        lib.addBook("333", "Clean Code", "Robert C. Martin");

        // Attempt to add a duplicate
        lib.addBook("111", "Duplicate Hobbit", "Unknown");

        System.out.println("\n========== Borrow Books ===========");
        // Borrow books
        lib.borrowBook("111");
        lib.borrowBook("111"); // try again (already borrowed)
        lib.borrowBook("999"); // non-existent ISBN

        System.out.println("\n========== Return Books ===========");
        // Return books
        lib.returnBook("111");
        lib.returnBook("111"); // try again (already returned)
        lib.returnBook("999"); // non-existent ISBN

        // Check status
        System.out.println("Is book 111 borrowed? " + lib.isBookBorrowed("111"));

        System.out.println("\n==========List of Books in Library===========");
        // List all books
        lib.listAllBooks();

        System.out.println("\n==========List of borrowed Books ===========");
        // Borrow another book and list borrowed books
        lib.borrowBook("222");
        lib.listBorrowedBooks();
    }
}
