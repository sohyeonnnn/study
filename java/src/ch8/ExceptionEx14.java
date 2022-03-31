package ch8;

public class ExceptionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1(); //예외 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main메서드에서 예외가 처리되었습니다"); //catch에서 처리
		}
	}

	static void method1() throws Exception {
		throw new Exception(); //예외 발생
	}
}
