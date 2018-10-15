package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		//开启开发模式
		me.setDevMode(true);
	}

	@Override
	public void configEngine(Engine me) {

	}

	@Override
	public void configHandler(Handlers me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configRoute(Routes me) {
		//配置/hello访问到HelloController的index()方法，这是约定，不要问为啥...
		me.add("/hello",HelloController.class);
	}

}
