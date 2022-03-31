package ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";

		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.234456789;

		// %g는 값을 간략하게 표현할 때 사용
		// %x,%o에 #을 사용하면 접두가 0x,0이 각각 붙는다
		// %X는 16진수에 사용되는 접두사와 영문자를 대문자로 출력
		System.out.printf("f1=%f,%e,%g%n", f1, f1, f1);
		System.out.printf("f2=%f,%e,%g%n", f2, f2, f2);
		System.out.printf("f3=%f,%e,%g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);

		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);

	}

}
