package ch7;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Math.random());
		out.println(random());

		// static import문을 선언했기 때문에 system안써도된다

		// System.out.println("Math.PI:" + Math.PI);
		out.print("Math.PI:" + PI);
	}

}
