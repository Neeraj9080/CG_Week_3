package doublylinkedlist.moviemanagementsystem;

class MovieInformation
{
    // Attributes of the class
    String title;
    String director;
    int year;
    double rating;
    MovieInformation next;
    MovieInformation prev;

    // Constructor of the class
    public MovieInformation(String title, String director, int year, double rating)
    {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
