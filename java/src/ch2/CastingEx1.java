package ch2;

public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 85.4;
		int score = (int) d; //int 형변환

		System.out.println("score=" + score);
		System.out.println("d=" + d); //형변환 후에도 피연산자에는 아무런 변화없음
	}

}
