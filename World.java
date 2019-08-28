import java.util.ArrayList;

public class World {
  ArrayList<Genre> availableGenre;
  boolean loggedIn;
  
  World() {
    
  }
  
  boolean login(String inputUsername, String inputPassword, Account acc) {
    return acc.username.equals(inputUsername)
        && acc.password.equals(inputPassword); //create a separate method for verifying password based on data structure created
  }

}
