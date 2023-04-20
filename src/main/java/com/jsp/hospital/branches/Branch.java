package com.jsp.hospital.branches;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;

	//@ManyToOne
	//private Hospital hospital2;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//public Hospital getHospital2() {
//		return hospital2;
	//}
	//public void setHospital2(Hospital hospital2) {
//		this.hospital2 = hospital2;
	//}
}
