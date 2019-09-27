package com.spring.dao;

import com.spring.pojo.User;

public interface UserDao {
	
	User getUser();
	
	int saveUser(User user);
	
	int delUser(int id);
	
	int getCount();

}
