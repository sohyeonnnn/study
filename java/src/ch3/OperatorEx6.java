package ch3;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b); // 명시적으로 형변환 필요
		System.out.println(c);

		// 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 떄는 자동으로 형변환
		// 반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자 사용
	}

}
