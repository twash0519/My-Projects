package fileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileWriter {
	public static void fileWriter(String location, ArrayList<Employee>empList) {
		
		
		try{
		File file = new File(location);
		FileWriter writer = new FileWriter(file, false);//false overwrites and true appends
		//writer.write("\n I am the 3rd employee");
		for(Employee empl : empList) {
			writer.write(empl.geteId()+ ", " );
			writer.write(empl.geteName()+ ", " );
			writer.write(empl.geteCity()+ "\n" );
		}
		writer.close();
		
		}catch(IOException e) {
			System.out.println("File not found!");
		}
		
	}

}
