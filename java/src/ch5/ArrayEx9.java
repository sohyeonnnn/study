package ch5;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length); // 0~4������ ������ ����
			arr[i] = code[tmp]; // �� ������ ����, ���̴� 10�� �迭
		}
		System.out.println(Arrays.toString(arr)); // �迭�� ���ڿ��� ���
	}

}
