import java.util.ArrayList;
import java.util.Arrays;

public class World {
  ArrayList<Genre> availableGenre;
  boolean loggedIn;
  ArrayList<Account> users;
  
  //finish constructur later
  World() {
    
  }
  
  //use regex
  boolean verifyPassword(String password) {
    return password.length() >= 8 
        && password.contains("A")
        && password.contains("1")
        && password.contains("@");

  }
  
  boolean login(String inputUsername, String inputPassword, Account acc) {
    return acc.username.equals(inputUsername)
        && acc.password.equals(inputPassword); //create a separate method for verifying password based on data structure created
  }
  
  void addAccount(Account newUser) {
    if (newUser.verifyAccount()) {
      this.users.add(newUser);
    }
  }
  
  void allPreferences() {
    Genre comedy = new Genre("Comedy");
    Genre horror = new Genre("Horror");
    Genre thriller = new Genre("Thriller");
    Genre adventure = new Genre("Adventure");
    Genre crime = new Genre("Crime");
    Genre drama = new Genre("Drama");
    Genre fantasy = new Genre("Fantasy");
    
    this.availableGenre.addAll(Arrays.asList(comedy, horror, thriller, adventure, crime, drama, fantasy));
  }
  
  //need to use swing/jfx
  void selectAccount() {
    
  }
  
  void updatePreferences() {
    for (int i = 0; i <= this.users.size(); i++) {
      Account tempAcc = this.users.get(i);
      if (tempAcc.selectedAccount) {
        tempAcc.updateGenre(this.availableGenre);
      }
    }
  }
}
