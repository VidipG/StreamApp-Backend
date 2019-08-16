import java.time.LocalDate;
import java.util.ArrayList;

public class Movie extends Video {
  String director;

  Movie(String name, ArrayList<Genre> genre, int duration, boolean watched, ArrayList<Boolean> ratings, ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate) {
    super(name, genre, duration, watched, ratings, suggested, language, rating, releaseDate);
    // TODO Auto-generated constructor stub
  }
}
