package ch3;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		// char c2=(char)(c1+1); //컴파일 에러
		char c2 = 'a' + 1; // (char)형변환 안해도 되는 이유:리터럴 간의 연산이기 때문
		System.out.println(c2);
	}

}
