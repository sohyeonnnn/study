package ch5;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////////// ��������5-3 : �迭 arr�� ��� ��� ���� ���ϴ� ���α׷�
		int[] arr3 = { 10, 20, 30, 40, 50 };
		int sum3 = 0;

		/*
		 * for(int i=0;i<arr3.length;i++) { sum3+=arr3[i]; }
		 */

		// ���� for��
		// for(Ÿ�Ժ�����:�迭 �Ǵ� �÷���) { �ݺ��� ���� }

		for (int i : arr3) {
			sum3 += i;
		}

		System.out.print("[��������5-3] ");
		System.out.println("sum=" + sum3);

		////////// ��������5-4 : 2���� �迭 arr�� ��� ��� ���� ���հ� ���
		int[][] arr4 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int total4 = 0;
		float average4 = 0;

		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				total4 += arr4[i][j];
			}
		}
		average4 = total4 / (float) (arr4.length * arr4[0].length);

		System.out.print("[��������5-4] ");
		System.out.print("total=" + total4);
		System.out.println(" average=" + average4);

		////////// ��������5-5 : 1~9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷�
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// �迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�, 20�� �ݺ�
		for (int x = 0; x < 20; x++) {
			int i = (int) (Math.random() * ballArr.length);
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			// �� �ٲٱ�
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�
		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);

		System.out.print("[��������5-5] ");
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);

		}
		System.out.println();

		////////// ��������5-6 : �Ž������� �� ���� �������� ������ �� �ִ��� ���
		// ū �ݾ��� ������ �켱������ �Ž��� �����
		/*
		 * int[] coinUnit = { 500, 100, 50, 10 }; int money = 2680;
		 * System.out.println("[��������5-6] "); System.out.println("money=" + money); for
		 * (int i = 0; i < coinUnit.length; i++) { int count = 0; count = money /
		 * coinUnit[i]; // ���� ���� System.out.printf("%d�� : %d%n", coinUnit[i], count);
		 * money = money % coinUnit[i]; // �Ž����ְ� ���� �� }
		 */

		////////// ��������5-7 : 5-6���� ������ ���� ����
		// ������ ������ ������ �Ž������� ������ �� ������ ��� ���
		// �Ž������� ������ ��ŭ ���� ������ ���� ���� ������ ������ ���

		System.out.println("[��������5-7] ");

		/*
		 * if (args.length != 1) { System.out.println("USAGE: java Exercise5_7 3120");
		 * System.exit(0); } // ���ڿ��� ���ڷ� ��ȯ��, �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ� int money =
		 * Integer.parseInt(args[0]); System.out.println("money=" + money); int[]
		 * coinUnit = { 500, 100, 50, 10 }; // ������ ���� int[] coin = { 5, 5, 5, 5 }; //
		 * ������ ������ ����
		 * 
		 * for (int i = 0; i < coinUnit.length; i++) { int coinNum = 0; // �ʿ��� ���� ����
		 * coinNum = money / coinUnit[i]; // �������� ������ �� �� �ʿ����� ��� if (coinNum > coin[i])
		 * {// ������ �ִ� �������� ���� �ʿ��ϸ� coinNum = coin[i]; // 5�� �� ����ϰ� coin[i] = 0;// ���� ����
		 * 0���� �ٲ� System.out.println(coinUnit[i] + " ��: " + coinNum); } else { // ������ �ִ�
		 * �������� �ذ�Ǹ� coin[i] -= coinNum; // ����� ������ŭ �� } money -= coinNum * coinUnit[i];
		 * // �Ž����ְ� ������ �Ž�����ߵǴ� �� }
		 * 
		 * if (money > 0) { // ���� �ٽ�µ� �Ž�����ߵǴ� �� ����������
		 * System.out.println("�Ž������� �����մϴ�"); System.exit(0); // ���α׷� ���� }
		 * System.out.println("=���� ������ ����="); for (int i = 0; i < coinUnit.length; i++)
		 * { System.out.println(coinUnit[i] + " ��:" + coin[i]); }
		 */

		////////// ��������5-8 : �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ '*' ���
		System.out.println("[��������5-8] ");
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++; // �ش� �� ��° ��Ҹ� ++
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(i + 1 + "�� ������ " + counter[i] + "�� / ");
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		////////// ��������5-9 : �־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ���
		System.out.println("[��������5-9] ");
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

		////////// ��������5-10 : ���ĺ��� ���ڸ� ��ȣǥ�� �����Ͽ� ��ȣȭ
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result10 = "";
		// ���ڿ� src�� ���ڸ� chatAt���� �ϳ��� �о ��ȯ�� result�� ����
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch >= 'a' && ch <= 'z') {// ch�� �ҹ��ڸ�
				ch = abcCode[ch - 'a']; // -'a'�ؼ� ���° ��������
				result10 += ch;
			} else if (ch >= '0' && ch <= '9') { // ���ڸ�
				ch = numCode[ch - '0']; // -'0'�ؼ� ���° ��������
				result10 += ch;
			}

		}
		System.out.println("[��������5-10] ");
		System.out.println("src:" + src);
		System.out.println("result:" + result10);

		////////// ��������5-11 : �־��� �迭�� �����ͺ��� ����, ���η� 1�� �� ū �迭 ������
		// �迭�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ���
		System.out.println("[��������5-11] ");
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };// [3][5]�迭
		int[][] result11 = new int[score.length + 1][score[0].length + 1]; // ũ��+1�� �ؼ� [4][6] �迭�� ����
		for (int i = 0; i < score.length; i++) { // 0,1,2,3,4
			for (int j = 0; j < score[i].length; j++) { // 0,1,2
				result11[i][j] = score[i][j];
				result11[i][score[i].length] += score[i][j]; // ��� ���� ���� ���ؼ� ������ ���� ����
				result11[score.length][j] += score[i][j]; // ��� ���� ���� ���ؼ� ������ �࿡ ����
				result11[score.length][score[i].length] += result11[i][j]; // ��� ���� ��
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
