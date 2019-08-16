import java.util.ArrayList;

public abstract class Video {
  String name;
  ArrayList<Genre> genre;
  int duration;
  int completed;
  boolean watched;
  boolean myFav;
  boolean download;
  ArrayList<Boolean> ratings;
  ArrayList<Video> suggested;
  ArrayList<String> subtitles;
  String language;
  double rating;
  
  Video(String name, ArrayList<Genre> genre, int duration, boolean watched, ArrayList<Boolean> ratings, ArrayList<Video> suggested, String language, double rating) {
    this.genre = genre;
    this.duration = duration;
    this.watched = watched;
    this.ratings = new ArrayList<Boolean>();
    this.suggested = new ArrayList<Video>();
    this.language = language;
    this.rating = this.setRating();
  }
  
  int remainingTime() {
    return this.duration = this.completed;
  }
  
  void setFav() {
    this.myFav = true;
  }
  
  double setRating() {
    int tempPos = 0;
    int tempNeg = 0;
    
    for (int i = 0; i < this.ratings.size(); i++) {
      if (this.ratings.get(i)) {
        tempPos++;
      } else {
        tempNeg++;
      }
    }
    
    double overallRating = tempPos / tempNeg;
    return overallRating;
  }
}
