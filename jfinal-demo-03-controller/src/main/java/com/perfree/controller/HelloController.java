package com.perfree.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
	/**
	 * 参考DemoConfig，这个方法的默认访问路径为/hello
	 */
	public void index() {
		renderText("Hello JFinal");
	}
	
	/**
	 * 这个方法的默认访问路径为/hello/sayHello
	 */
	public void sayHello() {
		renderText("sayHello");
	}
	
	/**
	 * 这个方法的默认访问路径为/hello/sayHi
	 */
	public void sayHi() {
		renderText("Hi~");
	}
}
