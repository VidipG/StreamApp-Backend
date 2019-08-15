
public class Movie extends Video {
  String director;
  Genre genre;
  Movie(String director) {
    //completed, language, watch, duration
    super(false, "english", 0, 0);
    this.director = director;
  }
  
  void updateDirector(String newDir) {
    this.director = newDir;
  }
  
  void updateCompleted(int completedSoFar) {
    this.watched = completedSoFar;
  }
  
  void updateDuration(int duration) {
    this.duration = duration;
  }
  
  void updateCompleted() {
    if ((this.duration != 0) && (this.watched != 0)) {
      if (this.watched == this.duration) {
        this.completed = true;
      }
    }
  }
}