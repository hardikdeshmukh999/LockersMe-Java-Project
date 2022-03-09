package lock2me;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;




public class Operation {
	
	
	
	public static void listFiles()
	{
		
	
			File dr = new File("C:/My_Files");
			File[] lstFiles = dr.listFiles();
		
		
		Scanner scanner = new Scanner(System.in);
		String readString = "";
		
		Arrays.sort(lstFiles);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		
		

		for (int i = 0 ; i < lstFiles.length; i++)
		{
			if (lstFiles[i].isFile())
			{
				System.out.println("File:- "+lstFiles[i].getName()+"Date:- "+dateFormat.format(lstFiles[i].lastModified()));	
			}

				
		}
		
		
		for (int i = 0 ; i < lstFiles.length; i++)
		{

			if (lstFiles[i].isDirectory())
			{
				System.out.println("Directory:- " + lstFiles[i].getName()+"Date:- "+dateFormat.format(lstFiles[i].lastModified()));
			}
				
		}
		
		System.out.println("Press Enter to go back to Menu");
		readString = scanner.nextLine();
		
		
	}
	
	
	
	
	public static void Operations()
	{
		//Initiate Scanner
		Scanner scanner = new Scanner(System.in);
		int readInteger = 0;

		
		do {
			
			System.out.println("------Perform Business operations------");
			 System.out.println("1. Add File");
			 System.out.println("2. Delete File");
			 System.out.println("3. Search File");
			 System.out.println("4. Back to Menu");
			 
			 readInteger = scanner.nextInt();
			 
			 if(readInteger==1)
			 {
				 System.out.println("Add Files Selected");
				 FileOp.AddFile();
				 
			 }
			 else if(readInteger==2)
			 {
				 System.out.println("Delete Files Selected");
				 FileOp.DeleteFile();
			 }
			 else if (readInteger==3)
			 {
				 System.out.println("Search Files Selected");
				 FileOp.SearchFile();
				 	 
			 }
			 else if (readInteger==4)
			 {

				 break;
				 
			 }
			
		}while(readInteger!=4);
		
	}

}
