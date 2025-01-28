package doublylinkedlist.moviemanagementsystem;

// Class to perform operations on movie records
class OperationsOnMovieInformation
{
    MovieInformation head, tail;

    // Constructor
    public OperationsOnMovieInformation()
    {
        head = tail = null;
    }

    // Add a movie record at the beginning
    public void addAtBeginning(String title, String director, int year, double rating)
    {
        MovieInformation newMovie = new MovieInformation(title, director, year, rating);
        if (head == null)
        {
            head = tail = newMovie;
        }
        else
        {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie record at the end
    public void addAtEnd(String title, String director, int year, double rating)
    {
        MovieInformation newMovie = new MovieInformation(title, director, year, rating);
        if (head == null)
        {
            head = tail = newMovie;
        }
        else
        {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title)
    {
        MovieInformation temp = head;
        while (temp != null)
        {
            if (temp.title.equals(title))
            {
                if (temp.prev != null)
                {
                    temp.prev.next = temp.next;
                }
                else
                {
                    head = temp.next;
                }
                if (temp.next != null)
                {
                    temp.next.prev = temp.prev;
                }
                else
                {
                    tail = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Search a movie by director
    public void searchByDirector(String director)
    {
        MovieInformation temp = head;
        while (temp != null)
        {
            if (temp.director.equals(director))
            {
                System.out.println("Movie Found " + temp.title + ", " + temp.year + ", " + temp.rating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found of this director");
    }

    // Update movie rating by title
    public void updateRating(String title, double newRating)
    {
        MovieInformation temp = head;
        while (temp != null)
        {
            if (temp.title.equals(title))
            {
                temp.rating = newRating;
                System.out.println("Rating updated for movie " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display movies in forward and reverse order
    public void displayMovies()
    {
        if (head == null)
        {
            System.out.println("No movies to display");
            return;
        }
        System.out.println("Movies in forward order are");
        MovieInformation temp = head;
        while (temp != null)
        {
            System.out.println("Title is " + temp.title);
            System.out.println("Director is " + temp.director);
            System.out.println("Year is " + temp.year);
            System.out.println("Rating is " + temp.rating);
            temp = temp.next;
        }

        System.out.println("Movies in reverse order are ");
        temp = tail;
        while (temp != null)
        {
            System.out.println("Title is " + temp.title);
            System.out.println("Director is " + temp.director);
            System.out.println("Year is " + temp.year);
            System.out.println("Rating is " + temp.rating);
            temp = temp.prev;
        }
    }
}