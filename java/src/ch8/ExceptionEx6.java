package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (Exception e) { //모든 예외 클래스는 Exception 클래스의 자손
			// TODO: handle exception
			System.out.println(5);
		}
		System.out.println(6);
	}

}
