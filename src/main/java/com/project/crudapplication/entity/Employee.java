package com.project.crudapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
	@Column(name = "first_name")
    private String firstName;
	@Column(name = "last_name")
    private String lastName;
	@Column(name = "email")
    private String email;
	@Column(name = "department")
    private String dep;
	@Column(name = "salary")
    private long sal;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dep=" + dep + ", sal=" + sal + "]";
	}
    
}
