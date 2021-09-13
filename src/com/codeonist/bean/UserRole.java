package com.codeonist.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "UserRole")
@Table(name = "USER_ROLE", schema = "hibernate", uniqueConstraints = { @UniqueConstraint(columnNames = "USER_ID") })
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "ROLE_ID", nullable = false)
	private Integer roleId;
	
	@Column(name = "STATUS", nullable = false, length = 8)
	private String status;
	
	public UserRole() {
	}
	
	public UserRole(Long id, Integer roleId, String status) {
		this.id = id;
		this.roleId = roleId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
