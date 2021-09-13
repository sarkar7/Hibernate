package com.codeonist.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Project")
@Table(name = "PROJECT", schema = "hibernate", uniqueConstraints = { @UniqueConstraint(columnNames = "PROJECT_ID") })
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "PROJECT_NAME", unique = false, nullable = false, length = 200)
	private String name;

	@Column(name = "OWNER_ID", unique = false, nullable = false)
	private Integer ownerId;

	@Column(name = "OWNER_LEVEL_ID", unique = false, nullable = false)
	private Integer ownershipLevelId;

	@Column(name = "STATUS", unique = false, nullable = false, length = 8)
	private String status;

	@ManyToMany(mappedBy = "projects")
	private Set<Employee> employees;

	public Project() {
	}

	public Project(String name, Integer ownerId, Integer ownershipLevelId, String status) {
		this.name = name;
		this.ownerId = ownerId;
		this.ownershipLevelId = ownershipLevelId;
		this.status = status;
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

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getOwnershipLevelId() {
		return ownershipLevelId;
	}

	public void setOwnershipLevelId(Integer ownershipLevelId) {
		this.ownershipLevelId = ownershipLevelId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
