package schoolManagementAppOneToMany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Teacher {
	@Id
	private int eId;
	private String eName;
	private double salary;
	
	
	public Teacher() {
		super();
		
	}
	
	public Teacher(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
