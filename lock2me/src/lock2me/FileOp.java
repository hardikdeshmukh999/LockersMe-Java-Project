package lock2me;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FileOp {
	
	
	public static void AddFile() {
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
	
	

		  public static void DeleteFile() { 
				System.out.println("Enter File name:");
				Scanner scanner = new Scanner(System.in);
				String filename = scanner.nextLine();
		    File myObj = new File("C:\\My_Files\\"+filename); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		  } 
		  
		  public static void SearchFile() {
				System.out.println("Enter File name:");
				Scanner scanner = new Scanner(System.in);
				String filename = scanner.nextLine();
				
				File dr = new File("C:/My_Files");
				String[] flist = dr.list();
			  
			  
		        // Empty array
		        if (flist == null) {
		            System.out.println(
		                "Empty directory or directory does not exists.");
		        }
		        else {
		  
		            // Print all files with same name in directory
		            // as provided in object of MyFilenameFilter
		            // class
		        	int r = 0;
		            for (int i = 0; i < flist.length; i++) {
		            	String name_of_file = flist[i];
		            	if (name_of_file.equalsIgnoreCase(filename)){
		            		r=r+1;	
		            		
		            	}
		            }
		            	if(r==0)
		            	{
		            		System.out.println("File Not Found");
		            	}
		            	else {
		            		System.out.println("File  Found");
		            		
		            	}
		            	
		            
		        }
		  }
		

}
