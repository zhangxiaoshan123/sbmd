package org.union.sbmd.service;

import java.util.List;

import org.union.sbmd.entity.User;

public interface UserService {

	
	public void save(User user);
	
	public List<User> getUsers();
}
