

public class Show extends Video {
  int seasons;
  Genre genre;
  
  Show(int seasons) {
    //completed, language, watch, duration
    super(false, "english", 0, 0); {
      this.seasons = seasons; 
    }
  }
}