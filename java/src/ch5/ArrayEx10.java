package ch5;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10)); // �迭�� 0~9������ ������ �� ����
		}
		System.out.println();

		// ���� ����
		for (int i = 0; i < numArr.length - 1; i++) { // �迭 ���� n���� n-1���� Ȯ���ϸ� �Ǵϱ� -1, ������ ���� �ִ밪�̱� ������ ���� �ʿ� ����
			boolean changed = false; // �ڸ��ٲ� üũ �뵵

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // ���� ���� ������ ���� �ٲ۴�
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					changed = true; // �ڸ��ٲ�
				}
			}
			if (!changed) { // ���̻� �ڸ��ٲ��� �Ͼ�� ������ break
				break;
			}

			// �������� ����
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}

	}

}
