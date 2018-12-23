import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class signup {
	private int accoutnID;
	public int fileName;
	public int getAccoutnID() {
		return accoutnID;
	}

	public void setAccoutnID(int accoutnID) {
		this.accoutnID = accoutnID;
	}
	
	public static void appendStrToFile(String fileName, String name, String email, String password) 
	{ 
		try { 
		
			BufferedWriter out = new BufferedWriter( 
			new FileWriter(fileName, true)); 
			out.write(name);
			out.write(" ");
			out.write(email);
			out.write(" ");
			out.write(password);
			out.write(" | ");
			
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		} 
	}
	
	
	
	
	
	static Scanner scan = new Scanner(System.in);

	public static void CreateAccount(int accountID) throws IOException
	{
		
		System.out.print("Welcome, please enter your name: ");
		String name = User.getName(); 
		name = scan.nextLine();
		
		System.out.print("Welcome, please enter your email: ");
		String email = User.getEmail(); 
		email = scan.nextLine();
		
		System.out.print("Welcome, please enter your password: ");
		String password = User.getPassword(); 
		password = scan.nextLine();
		
		 appendStrToFile("Accounts.txt", name, email, password);
		
	}
}
