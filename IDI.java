import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class IDI {
	
	public static void main(String args[]) throws IOException
	{
		
		int accountID = 0;
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("To creat an account press 1 ");
			
			System.out.println("To post an announcment or ask for a lost item on the news feed press 2 ");
			System.out.println("To post a founding on the news feed press 3 ");
			System.out.print("To exit press 0 --> ");
			choice = scan.nextInt();
			if(choice == 1)
			{
				System.out.print("enter account ID: ");
				accountID = scan.nextInt();
				signup.CreateAccount(accountID);
				accountID++;
			}
			else if(choice == 2)
			{
				News_Feed.askForLostItem();
				
			}
			else if(choice == 3)
			{
				News_Feed.tellAboutFounding();
			}
			else if(choice == 0)
				return;
		}
		
	}
}
