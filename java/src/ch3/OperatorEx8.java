package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000000;
		int b = 2000000;
		long c = a * b; // a,b가 int형이기 때문에 long타입으로 저장x
		// long c=(long)a*b; 로 해야 올바른 결과 얻음
		System.out.println(c);
	}

}
