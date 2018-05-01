package com.dev.nik.userportal.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dev.nik.userportal.domain.User;

@Component
public class UserRepositoryArrayListImpl implements UserRepository{	
	
	List<User> userList = new ArrayList<>();
	private static int userIdCount = 1;

	@Override
	public void delete(User user) {
		if(userList.contains(user)) {
			userList.remove(user);
			UserRepositoryArrayListImpl.userIdCount--;
		}
	}

	@Override
	public List<User> findAll() {
		return userList;
	}

	@Override
	public User findOne(int id) {
		for(User user : userList) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User save(User user) {
		user.setId(UserRepositoryArrayListImpl.userIdCount++);
		userList.add(user);
		return user;
	}

}
