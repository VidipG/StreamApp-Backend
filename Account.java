import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
  String username;
  String password; //store passwords externally
  LocalDate date;
  ArrayList<Genre> preferences;
  boolean selectedAccount;
  String email;
  //add a profile picture to the account
  
  private final int minAge = 13;
  boolean accountCreaed = false;
  public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  Account(String username, String password, LocalDate date, ArrayList<Genre> preferences, boolean selectedAccount, String email) {
    this.username = username;
    this.password = password;
    this.date = date;
    this.preferences = new ArrayList<Genre>();
    this.selectedAccount = false;
    
    if (this.emailValidate()) {
      this.email = email;
      this.accountCreaed = true; 
    }
  }
  
  //Change from regex to apache-commons based email verification
  public boolean emailValidate() {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(this.email);
    return matcher.find();
  }
  
  void updatePassword(String newPassword, String inputUsername) {
    if (this.username.equals(inputUsername)) {
      this.password = newPassword;
    }
  }

  boolean verifyAge() {
    LocalDate today = LocalDate.now();
    long p = ChronoUnit.YEARS.between(this.date, today);
    return p > minAge;
  }
  
  boolean verifyAccount() {
    return this.verifyAge() 
        && this.emailValidate();
  }
  
  void updateGenre(ArrayList<Genre> availableGenre) {
    String msg1 = new String("Here are the available genres:");
    for (int i = 0; i <= availableGenre.size(); i++) {
      System.out.println(i + availableGenre.get(i).name);
    }
    System.out.println("Enter the number of the genre you want to pick");
    int inputVal = 0; //update to take users input
    this.preferences.add(availableGenre.get(inputVal));
  }
}
