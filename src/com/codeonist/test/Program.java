package com.codeonist.test;

import com.codeonist.bean.UserRole;

public class Program {

	public static void main(String[] args) {

		UserRole role = new UserRole(1L, 3, "ACTIVE");
		System.out.println(role.getRoleId());
		System.out.println(role.hashCode());
		role.setRoleId(5);
		System.out.println(role.getRoleId());
		System.out.println(role.hashCode());

	}

}
