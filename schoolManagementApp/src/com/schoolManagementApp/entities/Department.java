package com.schoolManagementApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Department {
	@Id
	private int did;
	private String dName;
	
	
	public Department() {
		super();
	
	}
	
	public Department(int did, String dName) {
		super();
		this.did = did;
		this.dName = dName;
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
	
	

}
