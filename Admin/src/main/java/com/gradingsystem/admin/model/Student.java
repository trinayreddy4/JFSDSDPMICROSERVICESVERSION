package com.gradingsystem.admin.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	public Student()
	{
		
	}
	public Student(String name, String gender, String email, String mobileNo, String location,
			List<Assignment> assignments) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobileNo = mobileNo;
		this.location = location;
		this.assignments = assignments;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	
	private String name;
	private String gender;
	private String email;
	private String mobileNo;
	private String location;
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Column(name = "assignments")
	private List<Assignment> assignments;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", location=" + location + ", assignments=" + assignments + "]";
	}
	
	
	
}
