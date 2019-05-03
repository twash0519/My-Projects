package librarySoftware;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;




public class ReadFile {
	public static ArrayList<Author> fileReader(String location){
	
	ArrayList<Author> authorList = new ArrayList<Author>();
	
	try {
	File file = new File(location);
	
	Scanner inputFile = new Scanner(file);
	String line;
	
	while(inputFile.hasNextLine()) {
		line = inputFile.nextLine();
		if(!line.contentEquals(" ")) {
			String []lineArr = line.split(",");
			authorList.add(new Author (Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2]));	
		}
	}
	
	
	}
	catch (FileNotFoundException e){
		System.out.println("File not found");
		
		
	}
	
	
	return (authorList);
	}

}
