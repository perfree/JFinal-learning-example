package com.perfree.controller;

import java.util.List;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.perfree.model.User;
import com.perfree.service.UserService;

public class UserController extends Controller {
	
	//注入UserService
	@Inject
	UserService userService;
	
	//默认路径，查询所有用户信息并返回值user.html
	public void index() {
		List<User> users = userService.getAllUser();
		setAttr("users", users);
		render("user.html");
	}
	
	//删除用户
	public void del() {
		Integer id = getParaToInt("id");
		userService.delUserById(id);
		redirect301("/");
	}
	
	//前往添加用户页面
	public void toAdd() {
		render("add.html");
	}
	
	//添加用户
	public void addUser() {
		User user = getModel(User.class);
		userService.addUser(user);
		redirect301("/");
	}
	
	//根据id查询用户信息并前往至编辑页面
	public void toEdit() {
		Integer id = getParaToInt("id");
		User user = userService.findUserById(id);
		setAttr("user", user);
		render("edit.html");
	}
	
	//更新用户信息
	public void updateUser() {
		User user = getModel(User.class);
		userService.updateUser(user);
		redirect301("/");
	}
}
