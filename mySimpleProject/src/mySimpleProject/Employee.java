package mySimpleProject;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	
	
	
	public Employee(int id, String firstName, String lastName, String phone) {


		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	


	public void printEmployee() {
	System.out.println("ID: " + this.id + "\nFirst Name: " + this.firstName + "\nLast name: " + this.lastName + "\nPhone: " +this.phone+ "\n");
	
	
	
	
}

}
