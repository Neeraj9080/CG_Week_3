package doublylinkedlist.librarymanagementsystem;

// Class to perform operations on library books
class OperationsOnBooks
{
    BookDetails head, tail;

    // Constructor
    public OperationsOnBooks()
    {
        head = tail = null;
    }

    // Add a new book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookID, boolean availability)
    {
        BookDetails newBook = new BookDetails(title, author, genre, bookID, availability);
        if (head == null)
        {
            head = tail = newBook;
        }
        else
        {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add a new book at the end
    public void addAtEnd(String title, String author, String genre, int bookID, boolean availability)
    {
        BookDetails newBook = new BookDetails(title, author, genre, bookID, availability);
        if (head == null)
        {
            head = tail = newBook;
        }
        else
        {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add a new book at a specific position
    public void addAtSpecificPosition(String title, String author, String genre, int bookID, boolean availability, int position)
    {
        BookDetails newBook = new BookDetails(title, author, genre, bookID, availability);
        if (position == 0)
        {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
            return;
        }

        BookDetails temp = head;
        int index = 0;
        while (temp != null && index < position - 1)
        {
            temp = temp.next;
            index++;
        }

        if (temp != null)
        {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
        } else
        {
            System.out.println("Position out of range");
        }
    }

    // Remove a book by bookID
    public void removeBookByID(int bookID)
    {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        if (head.bookID == bookID)
        {
            head = head.next;
            if (head != null)
            {
                head.prev = null;
            }
            return;
        }

        BookDetails temp = head;
        while (temp != null && temp.bookID != bookID)
        {
            temp = temp.next;
        }

        if (temp != null)
        {
            if (temp.next != null)
            {
                temp.next.prev = temp.prev;
            }

            if (temp.prev != null)
            {
                temp.prev.next = temp.next;
            }
        }
        else
        {
            System.out.println("Book not found");
        }
    }

    // Search for a book by title or author
    public void searchByTitleOrAuthor(String searchTerm)
    {
        BookDetails temp = head;
        while (temp != null) {
            if (temp.title.equals(searchTerm) || temp.author.equals(searchTerm))
            {
                System.out.println("Found Book " + temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Update the availability status of a book
    public void updateAvailability(int bookID, boolean availability)
    {
        BookDetails temp = head;
        while (temp != null)
        {
            if (temp.bookID == bookID)
            {
                temp.availability = availability;
                System.out.println("Updated availability for Book ID: " + bookID);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Count the total number of books
    public void countTotalBooks()
    {
        int count = 0;
        BookDetails temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books in Library are " + count);
    }

    // Display all books in forward and reverse order
    public void displayBooks()
    {
        if (head == null)
        {
            System.out.println("No books to display");
            return;
        }

        System.out.println("Books in forward order are ");
        BookDetails temp = head;
        while (temp != null)
        {
            System.out.println("Title is " + temp.title);
            System.out.println("Author is " + temp.author);
            System.out.println("Genre is " + temp.genre);
            System.out.println("Availability is " + temp.availability);
            temp = temp.next;
        }

        System.out.println("Books in reverse order:");
        temp = tail;
        while (temp != null)
        {
            System.out.println("Title is " + temp.title);
            System.out.println("Author is " + temp.author);
            System.out.println("Genre is " + temp.genre);
            System.out.println("Availability is " + temp.availability);
            temp = temp.prev;
        }
    }
}