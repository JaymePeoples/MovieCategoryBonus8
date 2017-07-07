import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jayme Peoples on 7/7/2017.
 */
public class MovieApp {
    public static void main( String[] args ) {
//1) The application stores a list of 10 movies and displays them by category
        //2) user can enter any of the categories to display films in that list that match the category
        //3) User asked if he/she would like to continue
        //4) If doesn't want to continue the program ends
        //5) Each movie represented by object of type of movie
        //6) Movie class must provide two private fields: Title and Category
        //Category names are animated, drama, horror, scifi
        //7) Both title and category should be strings
        /*8) Class should provide constructor that accepts title and category as parameters and uses the values passed
             to it to initialize fields */
        /*9)When the user enters a category, the program should read through all movies in the ArrayList and display
            a line for any movie whose category matches the category entered by the user */
        //10) sufficient tests should be present
       Scanner scnr = new Scanner (System.in);
       String userInput = "";
       ArrayList<Movie> movie = new ArrayList<>();
       ArrayList<Movie> category = new ArrayList<>();

       Movie moana= new Movie();
       moana.setMovieTitle("Moana");
       moana.setCategory("animated");
       movie.add(moana);

       Movie elf = new Movie();
       elf.setMovieTitle("Elf");
       elf.setCategory("comedy");
       movie.add(elf);

       Movie flubber = new Movie();
       flubber.setMovieTitle("Flubber");
       flubber.setCategory("comedy");
       movie.add(flubber);

       Movie wonderwoman= new Movie();
       wonderwoman.setMovieTitle("Wonder Woman");
       wonderwoman.setCategory("action");
       movie.add(wonderwoman);

       Movie transformers = new Movie();
       transformers.setMovieTitle("Transformers");
       transformers.setCategory("action");
       movie.add(transformers);

       Movie poltergeist = new Movie();
       poltergeist.setMovieTitle("Poltergeist");
       poltergeist.setCategory("horror");
       movie.add(poltergeist);

       Movie it = new Movie();
       it.setMovieTitle("It");
       it.setCategory("horror");
       movie.add(it);

       Movie trolls= new Movie();
       trolls.setMovieTitle("Trolls");
       trolls.setCategory("animated");
       movie.add(trolls);

       Movie jaws = new Movie();
       jaws.setMovieTitle("Jaws");
       jaws.setCategory("horror");
       movie.add(jaws);

       Movie hiddenfigures = new Movie();
       hiddenfigures.setMovieTitle("Hidden Figures");
       hiddenfigures.setCategory("drama");
       movie.add(hiddenfigures);


       System.out.println("Input a category: ");
       userInput = scnr.nextLine();
       category = getSelectedMovies(userInput, movie);
       for (Movie title:category) {
          System.out.println(title);

       }

    }
   public static ArrayList<Movie> getSelectedMovies ( String userInput, ArrayList<Movie> movies){
       ArrayList<Movie> selectedMovies = new ArrayList<>();
       for(Movie movie: movies){
          if (userInput.equalsIgnoreCase(movie.getCategory())){
             selectedMovies.add(movie);
          }

       }
       return selectedMovies;

   }
}
