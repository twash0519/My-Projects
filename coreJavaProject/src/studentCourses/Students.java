package studentCourses;

import java.util.List;

public class Students {

	int sId;
	String sName;
	List<Course> sCourses;
	
	Students(int sId, String sName, List<Course> sCourses){//restriction
		this.sId = sId;
		this.sName = sName;
		this.sCourses=sCourses;
	}
	
	void printStudent() {
		System.out.println(sId);
		System.out.println(sName);
		for(Course c: sCourses) {
			System.out.println(c.cName);
		}
	}
	void dropCourse(String dropCourse) {
		
		if(sCourses.contains(dropCourse)) {
			sCourses.remove(dropCourse);
		}else {
			System.out.println("The course you're trying to drop is not in your list");
		}
		
	}
}
