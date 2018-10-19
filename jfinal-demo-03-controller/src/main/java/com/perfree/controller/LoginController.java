package com.perfree.controller;

import com.jfinal.core.Controller;

public class LoginController extends Controller{
	
	//先给个用户名~
	private String userName = "张三";
	//再给个密码~
	private String password = "123456";
	
	//默认访问此方法，返回login.html
	public void index() {
		render("login.html");
	}
	
	//登录方法
	public void subLogin() {
		//取得传来的name
		String name = getPara("name");
		//取得传来的pwd
		String pwd = getPara("pwd");
		//进行判断
		if(name.equals(userName) && pwd.equals(password)) {
			//登录成功
			renderText("欢迎你，"+name);
		}else {
			//登录失败
			renderText("账户或密码错误");
		}
		
	}

}
