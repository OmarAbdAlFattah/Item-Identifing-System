import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class News_Feed {

  public Items post;
  public static String ann;
  static Scanner scan = new Scanner(System.in);
  public static String date = "";
  public static String time = "";
  
  
  
  public static void askForLostItem() 
  {
	  System.out.print("what did you lost?: ");
	  ann = scan.nextLine();
	  
	  Date.setDateLost();
	  date += Date.getDateLost();
	  Time.setTimeLost();
	  time += Time.getTimeLost();
	  
	  appendStrToFile("News feed.txt", ann, "date of loosing", date, "time of loosing", time);
	  
  }
  public static void tellAboutFounding() 
  {
	  System.out.print("What did you find?: ");
	  ann = scan.nextLine();
	  
	  Date.setDateFound();
	  date += Date.getDateFound();
	  Time.setTimeFound();
	  time += Time.getTimeFound();
	  
	  appendStrToFile("News feed.txt", ann, "date of finding", date, "time of finding", time);
	  
  }

  
  public static void appendStrToFile(String fileName, String name, String placeHolder1, String date, String placeHolder2, String time) 
	{ 
		try { 
		
			BufferedWriter out = new BufferedWriter( 
			new FileWriter(fileName, true)); 
			out.write(name);
			out.write(" ");
			out.write(placeHolder1);
			out.write(" ");
			out.write(date);
			out.write(" ");
			out.write(placeHolder2);
			out.write(" ");
			out.write(time);
			out.write(" | ");
			
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		} 
	}
  
  public void EditPost() {
  }

  public void DeletePost() {
  }

}