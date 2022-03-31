package ch8;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			result = number / (int) (Math.random() * 10);
			//0으로 나누는 상황이 있을수 있기 때문에 예외발생 - ArithmeticException
			System.out.println(result);
		}

	}

}
