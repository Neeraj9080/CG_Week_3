package doublylinkedlist.librarymanagementsystem;

class BookDetails
{
    String title;
    String author;
    String genre;
    int bookID;
    boolean availability;
    BookDetails next;
    BookDetails prev;

    // Constructor of the class
    public BookDetails(String title, String author, String genre, int bookID, boolean availability)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.availability = availability;
        this.next = null;
        this.prev = null;
    }
}
