package com.schoolManamentApp.main;

import com.schoolManagementApp.services.SchoolServicesImplementation;
import com.schoolManagementApp.services.SchoolServicesInterface;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolServicesInterface school = new SchoolServicesImplementation();
		school.createTeacherDepartment();
	}

}
