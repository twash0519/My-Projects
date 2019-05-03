package ReadAndWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fileHandler.Employee;
import fileHandler.MyFileReader;
import fileHandler.MyFileWriter;

public class MainRunner {

	public static void main(String[] args) throws FileNotFoundException {
		String readerLocation ="D:\\Users\\theresa.gaines\\Documents\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\coreJavaProject0404\\src\\credentials.txt";
		String writerLocation = "D:\\Users\\theresa.gaines\\Documents\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\coreJavaProject0404\\src\\myBlog.txt";
		
		HashMap<String, String>blogger = new HashMap<String, String>();

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your username?");
		

		String userInput = input.nextLine();

		File file = new File(readerLocation);
		Scanner input2 = new Scanner(file); 

		input2.nextLine();
		
		while(input2.hasNext()) {
			String[] tokens = input2.nextLine().split(",");
			blogger.put(tokens[0], tokens[1]);
		}
		  
		
		for(Map.Entry<String, String> entry : blogger.entrySet())
			System.out.println("Key = " + entry.getKey()+ ", Value= " + entry.getValue());

			if(userInput != )

	}

}
