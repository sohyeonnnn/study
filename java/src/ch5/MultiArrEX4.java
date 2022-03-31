package ch5;

import java.util.Scanner;

public class MultiArrEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i + 1, words[i][0]);

			String tmp = sc.nextLine();

			if (tmp.equals(words[i][1])) { //배열의 2번째 값과 같으면 정답
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다%n%n", words[i][1]);
			}
		}
	}

}
