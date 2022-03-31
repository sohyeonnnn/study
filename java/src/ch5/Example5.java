package ch5;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////////// 연습문제5-3 : 배열 arr에 담긴 모든 값을 더하는 프로그램
		int[] arr3 = { 10, 20, 30, 40, 50 };
		int sum3 = 0;

		/*
		 * for(int i=0;i<arr3.length;i++) { sum3+=arr3[i]; }
		 */

		// 향상된 for문
		// for(타입변수명:배열 또는 컬렉션) { 반복할 문장 }

		for (int i : arr3) {
			sum3 += i;
		}

		System.out.print("[연습문제5-3] ");
		System.out.println("sum=" + sum3);

		////////// 연습문제5-4 : 2차원 배열 arr에 담긴 모든 값의 총합과 평균
		int[][] arr4 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int total4 = 0;
		float average4 = 0;

		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				total4 += arr4[i][j];
			}
		}
		average4 = total4 / (float) (arr4.length * arr4[0].length);

		System.out.print("[연습문제5-4] ");
		System.out.print("total=" + total4);
		System.out.println(" average=" + average4);

		////////// 연습문제5-5 : 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다, 20번 반복
		for (int x = 0; x < 20; x++) {
			int i = (int) (Math.random() * ballArr.length);
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			// 값 바꾸기
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);

		System.out.print("[연습문제5-5] ");
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);

		}
		System.out.println();

		////////// 연습문제5-6 : 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산
		// 큰 금액의 동전을 우선적으로 거슬러 줘야함
		/*
		 * int[] coinUnit = { 500, 100, 50, 10 }; int money = 2680;
		 * System.out.println("[연습문제5-6] "); System.out.println("money=" + money); for
		 * (int i = 0; i < coinUnit.length; i++) { int count = 0; count = money /
		 * coinUnit[i]; // 동전 갯수 System.out.printf("%d원 : %d%n", coinUnit[i], count);
		 * money = money % coinUnit[i]; // 거슬러주고 남은 돈 }
		 */

		////////// 연습문제5-7 : 5-6에서 동전의 개수 제한
		// 보유한 동전의 개수로 거스름돈을 지불할 수 없으면 경고문 출력
		// 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 출력

		System.out.println("[연습문제5-7] ");

		/*
		 * if (args.length != 1) { System.out.println("USAGE: java Exercise5_7 3120");
		 * System.exit(0); } // 문자열을 숫자로 변환함, 입력한 값이 숫자가 아닐 경우 예외가 발생한다 int money =
		 * Integer.parseInt(args[0]); System.out.println("money=" + money); int[]
		 * coinUnit = { 500, 100, 50, 10 }; // 동전의 단위 int[] coin = { 5, 5, 5, 5 }; //
		 * 단위별 동전의 개수
		 * 
		 * for (int i = 0; i < coinUnit.length; i++) { int coinNum = 0; // 필요한 동전 개수
		 * coinNum = money / coinUnit[i]; // 동전으로 나눠서 몇 개 필요한지 계산 if (coinNum > coin[i])
		 * {// 가지고 있는 개수보다 많이 필요하면 coinNum = coin[i]; // 5개 다 사용하고 coin[i] = 0;// 남은 개수
		 * 0으로 바꿈 System.out.println(coinUnit[i] + " 원: " + coinNum); } else { // 가지고 있는
		 * 개수에서 해결되면 coin[i] -= coinNum; // 사용한 개수만큼 뺌 } money -= coinNum * coinUnit[i];
		 * // 거슬러주고 나머지 거슬러줘야되는 돈 }
		 * 
		 * if (money > 0) { // 동전 다썼는데 거슬러줘야되는 돈 남아있으면
		 * System.out.println("거스름돈이 부족합니다"); System.exit(0); // 프로그램 종료 }
		 * System.out.println("=남은 동전의 개수="); for (int i = 0; i < coinUnit.length; i++)
		 * { System.out.println(coinUnit[i] + " 원:" + coin[i]); }
		 */

		////////// 연습문제5-8 : 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*' 출력
		System.out.println("[연습문제5-8] ");
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++; // 해당 값 번째 요소를 ++
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(i + 1 + "의 개수는 " + counter[i] + "개 / ");
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		////////// 연습문제5-9 : 주어진 배열을 시계방향으로 90도 회전시켜서 출력
		System.out.println("[연습문제5-9] ");
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		char[][] result = new char[star[0].length][star.length];

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				result[j][3 - i] = star[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

		////////// 연습문제5-10 : 알파벳과 숫자를 암호표를 참고하여 암호화
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result10 = "";
		// 문자열 src의 문자를 chatAt으로 하나씩 읽어서 변환후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch >= 'a' && ch <= 'z') {// ch가 소문자면
				ch = abcCode[ch - 'a']; // -'a'해서 몇번째 문자인지
				result10 += ch;
			} else if (ch >= '0' && ch <= '9') { // 숫자면
				ch = numCode[ch - '0']; // -'0'해서 몇번째 숫자인지
				result10 += ch;
			}

		}
		System.out.println("[연습문제5-10] ");
		System.out.println("src:" + src);
		System.out.println("result:" + result10);

		////////// 연습문제5-11 : 주어진 배열의 데이터보다 가로, 세로로 1이 더 큰 배열 생성후
		// 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력
		System.out.println("[연습문제5-11] ");
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };// [3][5]배열
		int[][] result11 = new int[score.length + 1][score[0].length + 1]; // 크기+1씩 해서 [4][6] 배열로 생성
		for (int i = 0; i < score.length; i++) { // 0,1,2,3,4
			for (int j = 0; j < score[i].length; j++) { // 0,1,2
				result11[i][j] = score[i][j];
				result11[i][score[i].length] += score[i][j]; // 모든 행의 값을 더해서 마지막 열에 저장
				result11[score.length][j] += score[i][j]; // 모든 열의 값을 더해서 마지막 행에 저장
				result11[score.length][score[i].length] += result11[i][j]; // 모든 값의 합
			}
		}
		for (int i = 0; i < result11.length; i++) {
			for (int j = 0; j < result11[i].length; j++) {
				System.out.printf("%4d", result11[i][j]);
			}
			System.out.println();
		}

	}
}
