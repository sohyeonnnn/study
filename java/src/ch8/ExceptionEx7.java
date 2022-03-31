package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // ArithmeticException 발생
			System.out.println(4);// 실행x
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			if (ae instanceof ArithmeticException) //어떤 예외인지 확인
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) { //ArithmeticException을 제외한 모든 예외가 처리
			System.out.println("exception");
		}
		System.out.println(6);
	}

}
