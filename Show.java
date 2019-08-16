import java.time.LocalDate;
import java.util.ArrayList;

public class Show extends Video {
  ArrayList<Season> seasons;
  Show(String name, ArrayList<Genre> genre, ArrayList<Boolean> ratings, ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate) {
    super(name, genre, ratings, suggested, language, rating, releaseDate);
    this.seasons = new ArrayList<Season>();
  }
}

class Season {
  int seasonNum;
  ArrayList<Program> content;
}

class Program {
  String epName;
  int duration;
  int completed;
  boolean watched;
}