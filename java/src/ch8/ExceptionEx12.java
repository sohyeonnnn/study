package ch8;

public class ExceptionEx12 {

	// 예외를 메서드에 선언 throws(throw는 예외를 발생시킬때)
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();
	}

	static void method1() throws Exception { // 예외 선언
		method2();
	}

	static void method2() throws Exception { // 예외 선언
		throw new Exception(); // 예외 발생
	}

	//예외가 발생했을 때 3개의 메서드 모두가 호출스택에 있음
	//예외가 발생한 곳은 제일 윗줄에 있는 method2
	// main -> method1 -> method2 호출

}