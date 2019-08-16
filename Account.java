import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
  String username;
  String password;
  LocalDate date;
  ArrayList<Genre> preferences;
  String email;
  
  private final int minAge = 13;
  boolean accountCreaed = false;
  public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  Account(String username, String password, LocalDate date, ArrayList<Genre> preferences, String email) {
    this.username = username;
    this.password = password;
    this.date = date;
    this.preferences = preferences;
    this.email = email;
  }
  
  //Change from regex to apache-commons based email verification
  public boolean emailValidate() {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(this.email);
    return matcher.find();
  }
  
  void verifyAccount() {
    if (this.emailValidate()) {
      this.accountCreaed = true;
    }
    
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
}
