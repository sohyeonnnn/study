package ch8;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //0으로 나눠서 고의로 ArithmeticExeption 발생
			System.out.println(4); //catch로 바로 가기 때문에 실행x
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(5); 
		}
		System.out.println(6);
	}

}
