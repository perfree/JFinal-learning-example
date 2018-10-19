package com.perfree.common;

import org.omg.PortableServer.RequestProcessingPolicyValue;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.perfree.controller.HelloController;
import com.perfree.controller.LoginController;

public class DemoConfig extends JFinalConfig {

	/**
	 * 启动入口，运行此 main 方法可以启动项目，此 main 方法可以放置在任意的 Class 类定义中，不一定要放于此
	 * 
	 * 使用本方法启动过第一次以后，会在开发工具的 debug、run configuration 中自动生成
	 * 一条启动配置项，可对该自动生成的配置再继续添加更多的配置项，例如 Program arguments
	 * 可配置为：src/main/webapp 80 / 5
	 * 
	 */
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/" ,5 );
	}
	
	/**
	 * 配置常量
	 */
	@Override
	public void configConstant(Constants me) {
		//开启开发模式
		me.setDevMode(true);
	}

	/**
	 * 配置路由
	 */
	@Override
	public void configEngine(Engine me) {

	}

	/**
	 * 配置插件
	 */
	@Override
	public void configHandler(Handlers me) {

	}

	/**
	 * 配置全局拦截器
	 */
	@Override
	public void configInterceptor(Interceptors me) {
	}

	/**
	 * 配置处理器
	 */
	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configRoute(Routes me) {
		/*
		 * 配置/hello访问到HelloController的index()方法，这是约定，不要问为啥...
		 * 例如我们访问http://127.0.0.1/hello其实是访问到的HelloController的index()方法，
		 * 而我们访问http://127.0.0.1/hello/sayHello其实访问的是HelloController的sayHello()方法
		 */
		me.add("/hello", HelloController.class);
		
		/**
		 * 第三个参数代表资源文件的目录，/为我们在启动方法配置的那个目录src/main/webapp
		 */
		me.add("/login", LoginController.class,"/");
	}

}
