package demo;

import com.jfinal.core.JFinal;

public class JFinalStrat {
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}
}
