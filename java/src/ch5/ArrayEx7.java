package ch5;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		System.out.print("�����迭:");
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 0~9 ����
			System.out.print(numArr[i]);
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9 ������ ��
			// �迭 ������ ������ ���Ƿ� ���´�
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.print("���� ��:");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
