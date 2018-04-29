package com.dev.nik.userportal.service;

import java.util.List;
import com.dev.nik.userportal.domain.User;

public interface UserService {	
	public User update(User user);
	public User findById(int id);
	public List<User> findAll();
	public User delete(int id);
	public User create(User user);
}
