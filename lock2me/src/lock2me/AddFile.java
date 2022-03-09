package lock2me;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class AddFile {
	
	
	public static void main() {
		System.out.println("Enter File name:");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
	    try {
	      File myObj = new File("C:/My_Files/"+filename);
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }

}
