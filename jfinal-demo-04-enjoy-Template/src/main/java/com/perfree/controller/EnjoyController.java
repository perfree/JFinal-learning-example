package com.perfree.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.perfree.pojo.User;

public class EnjoyController extends Controller {
	
	public void index() {
		//传入对象
		User user = new User();
		user.setName("铁蛋");
		user.setAge(22);
		setAttr("user", user);
		
		//向前台传入数字，前台作判断是否等于1，若等于1，展示哈哈，等于0展示呵呵，其他啦啦啦
		setAttr("num", 1);
		
		//向前台传入map
		Map<String,String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		setAttr("map", map);
		
		//向前台传入list
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王二");
		setAttr("names", list);
		
		//向前台传入空值
		setAttr("para", null);
				
		render("/index.html");
		
	}
}
