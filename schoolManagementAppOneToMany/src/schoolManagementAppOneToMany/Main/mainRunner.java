package schoolManagementAppOneToMany.Main;

import schoolManagementAppOneToMany.Services.SchoolManagagementAPPInterface;
import schoolManagementAppOneToMany.Services.SchoolManagementAppImplementation;

public class mainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SchoolManagagementAPPInterface school = new SchoolManagementAppImplementation();
		school.createDepartmentTeacher();

	}

}
