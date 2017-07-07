/**
 * Created by Jayme Peoples on 7/7/2017.
 */
public class Movie {
    private String movieTitle;
    private String category;

    //blank constructor
    public Movie(){

    }

    public Movie( String movieTitle, String category ) {
        this.movieTitle = movieTitle;
        this.category = category;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle( String movieTitle ) {
        this.movieTitle = movieTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    public String toString(){

        return movieTitle;
    }
}
