package ch5;

public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0~9���� num�迭�� ����
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) { 
			counter[numArr[i]]++; // �ش� ������ ������ŭ ���� ������
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "�� ����: " + counter[i]);
		}
	}

}
