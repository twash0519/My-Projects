package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//set up entities
@Entity

//create a course entity
public class Course {
	
	@Id
	@Column(name="id")
	private int cId;
	
	@Column(name="name")
	private String cName;
	
	@Column(name="Instructor")
	private String cInstructorName;

	
	//Default Constructor
	public Course() {
		
		this.cId = 0;
		this.cName = "DefaultName";
		this.cInstructorName = "DefaultInstructor";
	}
	
	
	//constructor
	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}


//toString method for properties
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cInstructorName=" + cInstructorName + "]";
	}


//create getters and setters
	public int getcId() {
		return cId;
	}



	public void setcId(int cId) {
		this.cId = cId;
	}



	public String getcName() {
		return cName;
	}



	public void setcName(String cName) {
		this.cName = cName;
	}



	public String getcInstructorName() {
		return cInstructorName;
	}



	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}
	
	
	
	

}
