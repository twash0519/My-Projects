package schoolManagementAppOneToMany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table

public class Department {
	
	@Id
	private int did;
	private String dName;
	
	@OneToMany(targetEntity = Teacher.class)
	private List teacherList;
	
	
	public Department() {
		super();
	}
	
	public Department(int did, String dName, List teacherList) {
		super();
		this.did = did;
		this.dName = dName;
		this.teacherList = teacherList;
	}
	
	

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}

	
	



}
