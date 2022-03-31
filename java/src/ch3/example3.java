package ch3;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연습문제3-3 : num의 값에 따라 양수/음수/0 출력 - 삼항연산자
		int num3 = 0;
		System.out.print("[연습문제3-3] ");
		System.out.println((num3 > 0 ? "양수" : (num3 == 0 ? "0" : "음수")));

		// 연습문제3-4 : num의 백의자리 이하 버리기
		int num4 = 321;
		System.out.print("[연습문제3-4] ");
		System.out.println(num4 / 100 * 100);

		// 연습문제3-5 : num의 일의 자리를 1로 바꾸기
		int num5 = 343;
		System.out.print("[연습문제3-5] ");
		System.out.println(num5 / 10 * 10 + 1);

		// 연습문제3-6 : num의 값보다 크면서 가장 가까운 10의 배수에서 num의 값을 뺀 나머지 구하기
		int num6 = 97;
		System.out.print("[연습문제3-6] ");
		System.out.println((num6 / 10 + 1) * 10 - num6);

		// 연습문제3-7 : 화씨를 섭씨로 변환, 소수점 셋째자리에서 반올림
		int f = 100;
		// math.round()를 사용하지 않고 처리
		float c = (int) (((float) f - 32) * 5 / 9 * 100 + 0.5) / 100.0f;
		System.out.print("[연습문제3-7] ");
		System.out.println("celcius:" + c);

		// 연습문제3-9 : ch가 영문자이거나 숫자일 때만 b의 값이 true
		char ch = 'z';
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
		System.out.print("[연습문제3-9] ");
		System.out.println(b);

		// 연습문제3-10 : 문자가 대문자인 경우에만 소문자로 변경
		char ch2 = 'A';
		char lowerCase = (ch2 >= 'A' && ch2 <= 'Z') ? (char) (ch2 + 32) : ch2;
		System.out.print("[연습문제3-10] ");
		System.out.print("ch:" + ch2);
		System.out.println(" -> lowerCase:" + lowerCase);

	}

}
