package Oops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

interface SearchGenre{
    void searchbyGenre(String genre);
}

interface SearchByTitle{
    void sbt(String title);
}

class Catalog implements SearchByTitle, SearchGenre{

    private static List<Movie> MovieList = new ArrayList<>();

    public void sbt(String title) {
        for(Movie movie : MovieList) {
            if(movie.getTitle().equals(title)) {
                movie.getMovieDetails();
                }
        }
    }
    public void searchbyGenre(String genre) {
        for (Movie movie : MovieList) {
            if(movie.getGenre().equalsIgnoreCase(genre)) {
                movie.getMovieDetails();
            }
        }
    }
    public static void main(String[] arg) {
        Catalog C = new Catalog();
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        Movie M1 = new Movie("Jananayagan","Emotion",3,"Tamil",date,"vijay","Action");
        MovieList.add(M1);

        Movie M2 = new Movie("Titanic","Story",4,"English",date,"India","Documentary");
        MovieList.add(M2);

        Movie M3 = new Movie("Meesayamuruku","Drama",5,"Tamil",date,"Tamil","Story");
        MovieList.add(M3);
        
        
        System.out.println("Searching Movie by Genre ");
        C.searchbyGenre("Action");
        C.searchbyGenre("Story");
        System.out.println(" Searching Movie by Title ");
        C.sbt("Meesayamuruku");
    }
}

class Movie {
    private String title;
    private String genre;
    private int rating;
    private String language;
    private Date releaseDate;
    private String country;
    private String category;

    public Movie(String title,String genre,int rating,String language,Date releaseDate,
    		String country,String category) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return category;
    }
    public void getMovieDetails() {
        System.out.println("Title of the movie: "+ title);
        System.out.println("Genre of the movie: "+ genre);
        System.out.println("Rating of the movie: "+ rating);
        System.out.println("Language of the movie: "+ language);
        System.out.println("Release Date of the movie: " + releaseDate);
        System.out.println("Country of the movie: " + country);
        System.out.println("Category of the movie: " + category);
    }

}