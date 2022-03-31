package ch2;

public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;

		// f와 d에 같은 값을 저장했지만, 실제로 저장되는 값은 다름
		// 저장할때 이미 값이 다르기 때문에 형변환해도 값이 같아지지 않음

		System.out.printf("f=%20.18f\n", f);
		System.out.printf("d=%20.18f\n", d);
		System.out.printf("d2=%20.18f\n", d2);
	}

}
