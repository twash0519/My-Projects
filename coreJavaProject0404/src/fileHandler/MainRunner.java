package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { String location =
		 * "D:\\Users\\theresa.gaines\\Documents\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\coreJavaProject0404\\src\\text.txt";
		 * File file = new File(location);
		 * 
		 * Scanner input = new Scanner(file); //String line = input.nextLine();
		 * //System.out.println(line); //String data =""; ArrayList<String> data = new
		 * ArrayList<String>(); while(input.hasNextLine()) { //data +=input.nextLine();
		 * data.add(input.nextLine());
		 * 
		 * } //System.out.println(data); for(String line: data) {
		 * System.out.println(line); } }catch(FileNotFoundException e){
		 * System.out.println("File not found"); }
		 */
		/*
		 * try { String location =
		 * "D:\\Users\\theresa.gaines\\Documents\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\coreJavaProject0404\\src\\text.txt";
		 * File file = new File(location);
		 * 
		 * Scanner input = new Scanner(file); //String line = input.nextLine();
		 * //System.out.println(line); //String data =""; ArrayList<String[]> data = new
		 * ArrayList<String[]>(); while(input.hasNextLine()) { //data
		 * +=input.nextLine(); String line = input.nextLine();
		 * data.add(line.split(","));
		 * 
		 * } //System.out.println(data); for(String[] line: data) {
		 * //System.out.println(line); for(String token : line) { System.out.print(token
		 * +"|"); } System.out.println(); } }catch(FileNotFoundException e){
		 * System.out.println("File not found"); }
		 */
		String location ="D:\\Users\\theresa.gaines\\Documents\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\coreJavaProject0404\\src\\text.txt";

		ArrayList<Employee>empList=MyFileReader.fileReader(location);
		
		// System.out.println(data);
					for (Employee emp : empList) {
						System.out.println(emp.toString());
						// emp.toString();

					}
					Employee emp1 = new Employee(003,"Lucy", "San Jose");
					Employee emp2 = new Employee(004,"David", "San Jose");
					Employee emp3 = new Employee(005,"Kevin", "San Jose");
					
					empList.add(emp1);
					empList.add(emp2);
					empList.add(emp3);
					
					
					MyFileWriter.fileWriter(location, empList);
		
	}

}

