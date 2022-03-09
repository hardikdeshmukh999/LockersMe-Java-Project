/**
 * 
 */
package lock2me;
import java.util.Scanner;

/**
 * @author smart
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Title Screen
		System.out.println("______________________________________");
		System.out.println("Welcome to Locker By Hardik Deshmukh");
		System.out.println("_____________________________________");
		
		
		
		//Initiate Scanner
		Scanner scanner = new Scanner(System.in);
		int readInteger = 0;

		 
		 while (readInteger != 1||readInteger != 2) {
			 
		//Ask
		 System.out.println("Press 1 to Continue...");
		 System.out.println("Press 2 to Exit...");
		 System.out.println("Your Input : ");
		 readInteger = scanner.nextInt();
			 
		 if (readInteger == 1)
		 {
			 System.out.println("Entering Menu..");
			 break;
		 }
		 else if (readInteger == 2)
		 {
			 System.out.println("Exiting Application..");
			 System.exit(0);
			 
		 }
		 
		 System.out.println("Try Again");
		 }
		 
		 readInteger = 0;
		 
			 
			 do {
		 
		 System.out.println("------Menu------");
		 System.out.println("1. List The Files");
		 System.out.println("2. Perform Business operations");
		 System.out.println("3. Exit Application");
		 
		 readInteger = scanner.nextInt();
		 
		 if(readInteger==1)
		 {
			 System.out.println("--------List Files----------");
			 Operation.listFiles();
			 
		 }
		 else if(readInteger==2)
		 {
			 
			 Operation.Operations();
			 
		 }
		 else if (readInteger==3)
		 {
			 System.out.println("Leaving Application");
			 
			 
		 }
			 
			 
		 
			 
			 
		 }while(readInteger!=3);
			 
		 
		 
		 System.out.println("Application Exited");
		 
		 
		 
	
	}
		 
		 

		 
		 
	    }

		
		

	


