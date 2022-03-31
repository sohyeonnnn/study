package ch4;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연습문제4-1
		// 1) if(x>10 && x<20)
		// 2) if(ch!='' || ch!='\t')
		// 3) if(ch=='x' || ch=='X')
		// 4) if(ch>='0' && ch<='9')
		// 5) if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		// 6) if(year%400==0||year%4==0||year%100!=0)
		// 7) if(!powerOn)
		// 8) if(str.equals("yes"))

		// 연습문제4-2 : 1~20 정수중 2 또는 3의 배수가 아닌 수의 총합
		System.out.print("[연습문제4-2] ");
		int sum2 = 0;
		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) { // 2,3의 배수가 아닌 수
				sum2 += i;
			}
		}
		System.out.println(sum2);

		// 연습문제4-3 : 1+(1+2)+(1+2+3)+(1+2+3+4)+..+(1+2+3+...+10)의 결과
		int sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				sum3 += j;
		}
		System.out.print("[연습문제4-3] ");
		System.out.println(sum3);

		// 연습문제4-4 : 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지
		// 홀수번째 수는 +, 짝수번째 수는 -
		int sum4 = 0;
		int num4 = 0;
		int s = 1;

		for (int i = 1; true; i++, s *= -1) { // s는 1,-1,1,-1,1,-1,1,-1... 반복
			num4 = i * s;
			sum4 += num4;
			sum4 += num4;
			if (sum4 > 100) {
				System.out.print("[연습문제4-4] ");
				System.out.println(i);
				break;
			}
		}

		// 연습문제4-5 :
		System.out.println("[연습문제4-5] ");
		/*
		 * for (int i = 0; i <= 10; i++) { for (int j = 0; j <= i; j++)
		 * System.out.print("*"); System.out.println(); }
		 */

		// ----> while문으로 바꾸기
		int i5 = 0;
		while (i5 <= 10) {// 0,1,2,3,...,10
			int j5 = 0;
			while (j5 <= i5) {
				System.out.print("*");
				j5++;
			}
			System.out.println();
			i5++;
		}

		// 연습문제4-6 : 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
		System.out.print("[연습문제4-6] ");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("(%d , %d)", i, j);
				}
			}
		}
		System.out.println();

		// 연습문제4-7 : 1부터 6사이의 임의의 정수를 변수에 저장
		int value = (int) (Math.random() * 6) + 1;
		System.out.print("[연습문제4-7] ");
		System.out.println(value);

		// 연습문제4-8 : 방정식 2x+4y=10의 모든 해를 구하시오 x,y는 0~10사이 수
		System.out.print("[연습문제4-8] ");
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.printf("(x=%d, y=%d)", x, y);
				}
			}
		}
		System.out.println();

		// 연습문제4-9 : 숫자로 이루어진 문자열이 있을 때 각 자리의 합을 더한 결과를 출력
		String str = "12345";
		int sum9 = 0;
		for (int i = 0; i < str.length(); i++) {
			sum9 += (str.charAt(i) - '0'); // 문자->숫자 : '0'을 뺀다
		}
		System.out.print("[연습문제4-9] ");
		System.out.println("sum=" + sum9);

		// 연습문제4-10 : 각 자리의 합을 더한 결과를 출력
		int num10 = 12345;
		int sum10 = 0;

		for (;;) {
			sum10 += num10 % 10; // 일의 자리 수
			num10 /= 10;
			if (num10 == 0) {
				break;
			}
		}
		System.out.print("[연습문제4-10] ");
		System.out.println("sum=" + sum10);

		// 연습문제4-11 : 피보나치수열의 10번째 수 계산
		// 수열의 첫 두 숫자를 1,1
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print("[연습문제4-11] ");
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}
		System.out.println();

		// 연습문제4-12 : 구구단 출력
		System.out.println("[연습문제4-12] ");
		for (int i = 1; i < 9; i += 3) {
			for (int j = 1; j <= 3; j++) {
				System.out.printf("%d * %d = %d \t %d * %d = %d \t %d * %d = %d \t\n", i + 1, j, (i + 1) * j, i + 2, j,
						(i + 2) * j, i + 3, j, (i + 3) * j);
			}
			System.out.println();
		}

		// 연습문제4-13 : 주어진 문자열이 숫자인지 판별
		String value13 = "12o34";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value13.length(); i++) {
			if (!(value13.charAt(i) >= '0' && value13.charAt(i) <= '9')) {
				isNumber = false;
			}
		}
		System.out.print("[연습문제4-13] ");
		if (isNumber) {
			System.out.println(value13 + "는 숫자입니다");
		} else {
			System.out.println(value13 + "는 숫자가 아닙니다");
		}

		// 연습문제4-14 : 숫자맞추기 게임
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("[연습문제4-14] ");
		/*do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			input = sc.nextInt();

			if (input == answer) {
				System.out.println("맞췄습니다");
				System.out.printf("시도횟수는 %d번 입니다.", count);
				break;
			} else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("더 작은 수를 입력하세요");
			}

		} while (true);*/

		// 연습문제4-15 : 회문수
		int number = 12321;
		int tmp = number;

		int result = 0; // 변수 number을 거꾸로 변환해서 담을 변수

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		System.out.print("[연습문제4-15] ");
		if (number == result) {
			System.out.println(number + "는 회문수 입니다");
		} else {
			System.out.println(number + "는 회문수가 아닙니다");
		}
	}

}
