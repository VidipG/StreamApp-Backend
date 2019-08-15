import java.util.ArrayList;

public class Video {
  boolean completed;
  int duration;
  String lang;
  int watched;
  ArrayList<Genre> genre;
  
  Video(boolean completed, String lang, int watched, ArrayList<Genre> genre) {
    this.completed = false;
    this.lang = lang;
    this.watched = 0;
    this.genre = genre;
  }
  Video(boolean completed, String lang, int watched, int duration) {
    this.completed = false;
    this.lang = lang;
    this.watched = 0;
    this.duration = duration;
  }
}

