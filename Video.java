import java.time.LocalDate;
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
  LocalDate releaseDate;
  String description;
  
  //if the video has been watched before
  Video(String name, ArrayList<Genre> genre, int duration, int completed, boolean watched, ArrayList<Boolean> ratings, ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate, String description) {
    this.genre = genre;
    this.duration = duration;
    this.completed = completed;
    this.watched = watched;
    this.ratings = new ArrayList<Boolean>();
    this.suggested = new ArrayList<Video>();
    this.language = language;
    this.rating = this.setOverallRating();
    this.releaseDate = releaseDate;
    this.description = description;
  }
  
  //new video/ hasnt been watched before
  Video(String name, ArrayList<Genre> genre, int duration, ArrayList<Boolean> ratings, ArrayList<Video> suggested, String language, double rating, LocalDate releaseDate, String description) {
    this.name = name;
    this.genre = genre;
    this.duration = duration;
    this.ratings = new ArrayList<Boolean>();
    this.suggested = new ArrayList<Video>();
    this.language = language;
    this.rating = rating;
    this.releaseDate = releaseDate;
    this.description = description;
  }
  
  int remainingTime() {
    int remTime = this.duration - this.completed;
    if (remTime == 0) {
      this.watched = true;
    }
    return remTime;
  }
  
  void setFav() {
    this.myFav = true;
  }
  
  void setRating(boolean rat) {
    this.ratings.add(0, rat);
    ArrayList<Boolean> tempArr = new ArrayList<Boolean>();
    tempArr.add(true);
    System.out.println(tempArr);
  }
  
  double setOverallRating() {
    int tempPos = 0;
    int tempNeg = 0;
    
    for (int i = 0; i <= this.ratings.size(); i++) {
      if (this.ratings.get(i)) {
        tempPos++;
      } else {
        tempNeg++;
      }
    }
    
    double overallRating = tempPos / tempNeg;
    return overallRating;
  }
  
  //double check add details
  //add subtitle datta type
  void addSubtitle(String newLang) {
    this.subtitles.add(newLang);
  }
  
  void updateDescription(String description) {
    this.description = description;
  }
}












