package ex;

import java.util.Scanner;

public class Sort {

	// 100 이하의 숫자 5개 입력받아서 sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5]; // 숫자 5개 저장 배열
		for (int i = 0; i < num.length; i++) { // 5개 받음
			System.out.print("숫자 입력(1~100) > ");
			int n = sc.nextInt();
			if (n < 1 || n > 100) { // 1~100 수가 아닐경우
				i--;
				continue;
			}
			num[i] = n;
		}

		// 정렬
		for (int i = 0; i < num.length - 1; i++) { // (배열길이-1)번 비교
			for (int j = 0; j < num.length - i - 1; j++) { // 오른쪽 i개 요소는 오름차순 정렬이 되어있으므로 비교x
				if (num[j] > num[j + 1]) { // 왼쪽의 숫자가 더 크면 서로 바꾼다
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}

		// 출력
		for (int i : num) {
			System.out.print(i + " ");
		}
	}
}
