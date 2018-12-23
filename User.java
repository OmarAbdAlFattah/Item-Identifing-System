import java.util.*;

public class User {

  private static String Name;
  private static String Email;
  private  static String Password;
  private static Boolean State;
  private static News_Feed myNews;
  //Items item = new Items; 
  public void PostItem(Items i) {
  }

  public void ClaimFounding(Items i) {
  }

public static String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public static String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public static String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public Boolean getState() {
	return State;
}

public void setState(Boolean state) {
	State = state;
}

public News_Feed getMyNews() {
	return myNews;
}

public void setMyNews(News_Feed myNews) {
	this.myNews = myNews;
}

  

}