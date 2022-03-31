package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MIN_VALUE;// 정수형의 최소값

		out.println("i=" + i);
		out.println("-i=" + (-i)); //오버플로우 발생 - int의 최소값이 다시 원래의 값이 되어버림

		try {
			out.printf("negateExact(%d)=%d%n", 10, negateExact(10));
			out.printf("negateExact(%d)=%d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)=%d%n", i, negateExact(i)); // 예외 발생

		} catch (Exception e) {
			// TODO: handle exception
			// i를 long타입으로 형변환 다음에 negateExact(long a) 호출
			out.printf("negateExact(%d)=%d%n", (long) i, negateExact((long) i));
		}

	}

}
