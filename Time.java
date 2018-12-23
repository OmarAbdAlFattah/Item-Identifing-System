import java.util.*;

public class Time {

	private static String timeFound;
	private static String timeLost;
	static Scanner scan = new Scanner(System.in);
	
	  public static void setTimeFound()
	  {
		  System.out.print("Enter time of founding: ");	  
		  timeFound = scan.nextLine();
	  }
	  public static String getTimeFound()
	  {
		  return timeFound; 
	  }
	  
	  public static void setTimeLost()
	  {
		  System.out.print("Enter time of loosing: ");	  
		  timeLost = scan.nextLine();
	  }
	  public static String getTimeLost()
	  {
		  return timeLost; 
	  }

}