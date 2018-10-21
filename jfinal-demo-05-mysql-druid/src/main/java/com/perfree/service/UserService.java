package com.perfree.service;

import java.util.List;

import com.perfree.model.User;

public class UserService {
	
	//声明dao
	private User userDao = new User().dao(); 

	/**
	 * 获取所有用户信息
	 * @return List<User>
	 */
	public List<User> getAllUser() {
		List<User> users = userDao.find("select *from user");
		return users;
	}
	
	/**
	 * 删除用户
	 */
	public void delUserById(Integer id) {
		userDao.deleteById(id);
	}
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user) {
		user.save();
	}
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return User
	 */
	public User findUserById(Integer id) {
		User user = userDao.findById(id);
		return user;
	}
	
	/**
	 * 更新用户信息
	 * @param user
	 */
	public void updateUser(User user) {
		user.update();
		
	}

}
