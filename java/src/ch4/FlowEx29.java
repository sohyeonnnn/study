package ch4;

public class FlowEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 369����
		for (int i = 1; i <= 100; i++) {

			System.out.printf("i=%d ", i);

			int tmp = i; // i�� �� �ڸ��� Ȯ���ϱ� ���� �ӽð��� �����Ͽ� ����

			do {
				// 3�� ����� �ִ��� Ȯ��
				// tmp%10:n��° �ڸ��� -> ���� 0�� �ƴҶ� %3�Ͽ� 3�� ������� Ȯ��
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print("¦");
				}
			} while ((tmp /= 10) != 0); // tmp���� 0�� �ɶ����� �ݺ� ����
			System.out.println();
		}
	}

}
