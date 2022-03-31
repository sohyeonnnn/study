package ch4;

import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		System.out.print("*을 출력할 라인의 수를 입력하세요 >");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp); // 출력할 라인수

		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
