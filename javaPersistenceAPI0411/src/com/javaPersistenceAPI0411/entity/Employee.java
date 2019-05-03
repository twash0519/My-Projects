package com.javaPersistenceAPI0411.entity;





//adding annotations

	@Entity
	@Table(name="jpaEmployeeSecond")
	@NamedQuery(query="Select e from Employee e where e.eid = :id", name="Find Employee by ID")

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

		public Employee() {
			super();
			
		}
		

		public Employee(int requireID, String firstName, String lastName, String phoneNumber) {
			super();
			this.requireID = requireID;
			FirstName = firstName;
			LastName = lastName;
			PhoneNumber = phoneNumber;
		}


		
	
	

}
