package doublylinkedlist.librarymanagementsystem;

// Main class
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        OperationsOnBooks newBook = new OperationsOnBooks();

        // Adding books at the beginning
        newBook.addAtBeginning("The Discovery of India", "Jawaharlal Nehru", "History", 101, true);

        // Adding books at the end
        newBook.addAtEnd("India After Gandhi", "Ramachandra Guha", "History", 102, false);

        // Adding books at the specific position
        newBook.addAtSpecificPosition("Freedom at Midnight", "Larry Collins and Dominique Lapierre", "History", 103, true,1);

        // Displaying books
        newBook.displayBooks();

        // Searching for a book
        newBook.searchByTitleOrAuthor("Jawaharlal Nehru");

        // Updating book availability
        newBook.updateAvailability(103, true);

        // Removing a book
        newBook.removeBookByID(102);

        // Displaying books again
        newBook.displayBooks();

        // Counting total books
        newBook.countTotalBooks();
    }
}

