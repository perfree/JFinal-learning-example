package com.perfree.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import com.perfree.controller.UserController;
import com.perfree.model.User;

public class DemoConfig extends JFinalConfig {
	/**
	 * 启动方法
	 * @param args
	 */
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/",5);
	}
	
	/**
	 * 配置常量
	 */
	@Override
	public void configConstant(Constants me) {
		//加载外部配置文件
		loadPropertyFile("db.properties");
		me.setDevMode(true);
		//开启支持注解，支持 Controller、Interceptor 之中使用 @Inject 注入业务层，并且自动实现 AOP
		me.setInjectDependency(true);
	}

	/**
	 * 配置模板
	 */
	@Override
	public void configEngine(Engine me) {

	}

	/**
	 * 配置处理器
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
	 * 配置插件
	 */
	@Override
	public void configPlugin(Plugins me) {
		//配置druid连接池
		DruidPlugin db = new DruidPlugin(getProperty("jdbcUrl"),getProperty("user"),getProperty("password"));
		me.add(db);
		//ActiveRecord是作为JFinal的Plugin而存在的，所以使用时需要在JFinalConfig中配置ActiveRecordPlugin
		ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(db);
		activeRecordPlugin.addMapping("user", User.class);
		//展示sql语句
		activeRecordPlugin.setShowSql(true);
		me.add(activeRecordPlugin);
	}
	
	/**
	 * 配置路由
	 */
	@Override
	public void configRoute(Routes me) {
		me.add("/", UserController.class,"/");
	}

}
