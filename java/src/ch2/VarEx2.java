package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		int tmp = 0;

		System.out.println("x: " + x + " y: " + y);
 
		//두 변수 값을 교환
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x: " + x + " y: " + y);
	}

}
