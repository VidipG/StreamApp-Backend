import java.time.LocalDate;
import java.util.ArrayList;

public class Show extends Video {

  Show(String name, ArrayList<Genre> genre, int duration, ArrayList<Boolean> ratings,
      ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate,
      String description) {
    super(name, genre, duration, ratings, suggested, language, rating, releaseDate, description);
    // TODO Auto-generated constructor stub
  }

  ArrayList<Season> seasons;
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