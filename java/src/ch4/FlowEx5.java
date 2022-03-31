package ch4;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력헤주세요>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		System.out.printf("당신의 점수는 %d입니다.%n", score);
		// 중첩if
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
	}

}
