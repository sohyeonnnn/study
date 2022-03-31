package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ",j=" + j);

		i = 5;
		j = 0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ",j=" + j);

		// 전위형은 변수의 값을 먼저 증가시킨 후에 변수의 값을 읽어옴
		// 후위형은 변수의 값을 먼저 읽어온 후에 값을 증가
	}

}
