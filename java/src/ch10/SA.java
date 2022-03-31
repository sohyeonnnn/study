package ch10;

public class SA {

	public static void main(String[] args) {

		int num = 0;
		int answer = 0;

		while (num > 1) {
			if (num % 2 == 0) {
				num /= 2;
				answer++;
				System.out.println(num);
			}
			if (num % 2 == 1) {
				num = (num * 3) + 1;
				answer++;
				System.out.println(num);
			}
			if (answer > 500) {
				answer = -1;
				System.out.println(num);
				break;
			}
		}

	}
}
