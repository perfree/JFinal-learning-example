package demo;

import com.jfinal.core.Controller;

/**
 * @ClassName HelloController
 * @Description TODO(HelloController继承Controller)
 * @Author Perfree
 * @Date 2018/10/16 12:37
 * @Version 1.0
 */
public class HelloController extends Controller {

    public void index(){
        renderText("Hello JFinal By Idea+Maven");
    }
}
