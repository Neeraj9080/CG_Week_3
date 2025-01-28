package doublylinkedlist.moviemanagementsystem;

// Main class
public class MovieManagementSystem
{
    public static void main(String[] args)
    {
        OperationsOnMovieInformation movieList = new OperationsOnMovieInformation();

        // Adding movies at the beginning
        movieList.addAtBeginning("Avengers Endgame", "Russo Brothers", 2019, 9.5);

        // Adding movies at the beginning
        movieList.addAtBeginning("Avengers", "Joss Whedon", 2012, 9.0);

        // Adding movies at the end
        movieList.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);

        // Displaying movies
        movieList.displayMovies();

        // Removing a movie
        movieList.removeMovieByTitle("Avengers");

        // Searching for a movie by director
        movieList.searchByDirector("Christopher Nolan");

        // Updating movie rating
        movieList.updateRating("Inception", 9.0);

        // Displaying movies after updates
        movieList.displayMovies();
    }
}
