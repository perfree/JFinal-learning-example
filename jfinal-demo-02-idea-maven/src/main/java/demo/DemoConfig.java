package demo;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * @ClassName DemoConfig
 * @Description TODO(DemoConfig配置，继承JFinalConfig)
 * @Author Perfree
 * @Date 2018/10/16 12:32
 * @Version 1.0
 */
public class DemoConfig extends JFinalConfig {
    public void configConstant(Constants constants) {
        //开启开发模式
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes) {
        //配置路由，/hello默认访问HelloController的index()方法，如果是/hello/sayHello，将访问HelloController的sayHello方法
        routes.add("/hello",HelloController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {

    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
