package com.microservices.user.valueObjects;

import com.microservices.user.model.User;

public class ResponseTemplateVO {

	private User users;
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	

}
