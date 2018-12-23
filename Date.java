import java.util.Scanner;

public class Date {
	private static String dateFound;
	private static String dateLost;
	static Scanner scan = new Scanner(System.in);
	
  public static void setDateFound()
  {
	  System.out.print("Enter date of founding: ");
	  dateFound = scan.nextLine();
  }
  public static String getDateFound()
  {
	  return dateFound; 
  }
  
  public static void setDateLost()
  {
	  System.out.print("Enter date of loosing: ");
	  dateLost = scan.nextLine();
  }
  public static String getDateLost()
  {
	  return dateLost; 
  }

}