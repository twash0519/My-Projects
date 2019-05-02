package coreJava0325;

import java.util.Arrays;

public class SubjectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Math|English|Law";
		String delimeter=",";
		s = s.replaceAll("\\s*\\|\\s*", " ");
		
		
		String[] subjectArr = s.split(delimeter);
		System.out.println(Arrays.toString(subjectArr));

	}

}
