import java.time.LocalDate;
import java.util.ArrayList;

public class Movie extends Video {
  
  Movie(String name, ArrayList<Genre> genre, int duration, ArrayList<Boolean> ratings,
      ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate,
      String description) {
    super(name, genre, duration, ratings, suggested, language, rating, releaseDate, description);

  }

  String director;

  
}
