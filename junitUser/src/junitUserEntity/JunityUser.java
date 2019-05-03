package junitUserEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table 
public class JunityUser {
		
	@Id
	private int id;
	private String email;
	private String name;
	private String password;
	private String address;
	private String state;
	private String zipCode;
	
	
	
	
	public JunityUser() {
		super();
		
	}
	
	public JunityUser(int id, String email, String name, String password, String address, String state,String zipCode) {
		
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
	}

	
	
	@Override
	public String toString() {
		return "JunityUser [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", address="
				+ address + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof JunityUser) {
			JunityUser other = (JunityUser) obj;
			
			
			boolean sameid = this.id == other.getId();
			boolean sameemail = this.email.equals(other.getEmail());
			boolean samename = this.name.equals(other.getName());
			boolean samepassword = this.password.equals(other.getPassword());
			boolean sameaddress = this.address.equals(other.getAddress());
			boolean samestate = this.state.equals(other.getState());
			boolean samezipCode = this.zipCode.equals(other.getZipCode());
			
			if(sameid && sameemail && samename && samepassword && sameaddress && samestate && samezipCode) {
				return true;
			}else {
				return false;
			}
	}else {
			return false;
		}	
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
	

}
