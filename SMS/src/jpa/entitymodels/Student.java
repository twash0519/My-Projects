package jpa.entitymodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//set up the entities
@Entity
//Create student entity
public class Student {
	
	@Id
	@Column(name="email")
	private String sEmail;
	@Column(name="name")
	private String sName;
	@Column(name="password")
	private String sPass;
	
	
	
	
	//create a one to many table
	@OneToMany
	private List<Course> sCourses;

	//create a default constructor
	public Student() {
		super();
		this.sEmail = "default@email.com";
		this.sName = "defaultName";
		this.sPass = "defaultPass";
		this.sCourses = null;
	}
	
	//create a constructor
	public Student(String sEmail, String sName, String sPassword, List sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPassword;
		this.sCourses = sCourses;
	}

	
	
	//create a toString method

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
	}

	//add getters and setters
	public String getsEmail() {
		return sEmail;
	}


	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsPass() {
		return sPass;
	}


	public void setsPass(String sPass) {
		this.sPass = sPass;
	}


	public List getsCourses() {
		return sCourses;
	}


	public void setsCourses(List sCourses) {
		this.sCourses = sCourses;
	}

	
	
	
	
	
	

}
