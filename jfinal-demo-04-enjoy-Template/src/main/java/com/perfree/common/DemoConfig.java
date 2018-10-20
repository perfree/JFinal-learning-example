package com.perfree.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;
import com.perfree.controller.EnjoyController;

public class DemoConfig extends JFinalConfig {
	
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/",5);
	}
	
	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	@Override
	public void configEngine(Engine me) {
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configRoute(Routes me) {
		me.add("/", EnjoyController.class,"/");

	}

}
