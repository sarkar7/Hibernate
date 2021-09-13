package com.codeonist.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Employee")
@Table(name = "EMPLOYEE", schema = "hibernate", uniqueConstraints = { @UniqueConstraint(columnNames = "EMPLOYEE_ID") })
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "EMPLOYEE_NAME", nullable = false, length = 200)
	private String name;
	
	@Column(name = "EMPLOYEE_AGE", nullable = false)
	private Integer age;
	
	@Column(name = "EMPLOYEE_ROLE_ID", nullable = false)
	private Long roleId;
	
	@Column(name = "EMPLOYEE_ADDRESS_ID", nullable = false)
	private Long addressId;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="EMPLOYEE_PROJECT", joinColumns = {@JoinColumn(referencedColumnName="EMPLOYEE_ID")},
			inverseJoinColumns={@JoinColumn(referencedColumnName="PROJECT_ID")})
	private Set<Project> projects;
	

	public Employee() {
	}

	public Employee(Long id) {
		this.id = id;
	}

	public Employee(String name, Integer age, Long roleId, Long addressId, Long managerId) {
		this.name = name;
		this.age = age;
		this.roleId = roleId;
		this.addressId = addressId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}
