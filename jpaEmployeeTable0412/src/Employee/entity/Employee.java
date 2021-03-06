package Employee.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpaEmployeeSecond")



public class Employee {
	@Id
	@Column(name = "requireID")
	private int requireID;
	
	@Basic
	@Column(name="FirstName")
	private String FirstName;
	
	@Basic
	@Column(name="LastName")
	private String LastName;
	
	
	@Basic
	@Column(name="PhoneNumber")
	private String PhoneNumber;

	
	public Employee() {
		
	}


	public Employee(int requireID, String firstName, String lastName, String phoneNumber) {
		super();
		this.requireID = requireID;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
	}


	public int getRequireID() {
		return requireID;
	}


	public void setRequireID(int requireID) {
		this.requireID = requireID;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	
	
	

	

}
