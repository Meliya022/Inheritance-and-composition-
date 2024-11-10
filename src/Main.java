//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a director
        Director director1 = new Director("Christopher Nolan", 50);

        // Creating an actor list for Movie
        ArrayList<Actor> movieCast = new ArrayList<>();
        movieCast.add(new Actor("Leonardo DiCaprio", 45));
        movieCast.add(new Actor("Joseph Gordon-Levitt", 39));

        // Creating a Movie object
        Movie movie = new Movie("Inception", "PG-13", director1, movieCast, 148, "A mind-bending thriller.", 829.9);

        // Printing details of the Movie object
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector().getName());

        // Creating a director for the TvShow
        Director director2 = new Director("Duffer Brothers", 38);

        // Creating an actor list for TvShow
        ArrayList<Actor> tvShowCast = new ArrayList<>();
        tvShowCast.add(new Actor("Winona Ryder", 48));
        tvShowCast.add(new Actor("David Harbour", 46));

        // Creating a TvShow object
        TvShow tvShow = new TvShow("Stranger Things", "MA", director2, tvShowCast, 4, 34);

        // Printing details of the TvShow object
        System.out.println("TV Show Title: " + tvShow.getTitle());
        System.out.println("Seasons: " + tvShow.getSeasons());
    }
}

class Media {
    private String title;
    private String rating;
    private Director director;
    private ArrayList<Actor> cast;

    public Media(String title, String rating, Director director, ArrayList<Actor> cast) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }
}

class Director {
    private String name;
    private int age;

    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Actor {
    private String name;
    private int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Movie extends Media {
    private int length;
    private String description;
    private double grossing;

    public Movie(String title, String rating, Director director, ArrayList<Actor> cast, int length, String description, double grossing) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public double getGrossing() {
        return grossing;
    }
}

class TvShow extends Media {
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, Director director, ArrayList<Actor> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }
}
