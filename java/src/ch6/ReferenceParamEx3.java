package ch6;

import java.security.Principal;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 }; // ����,�ʱ�ȭ
		printArr(arr); // �迭�� ��� ��� ���
		sortArr(arr);
		printArr(arr);
		System.out.println("sum=" + sumArr(arr));

	}

	static void printArr(int[] arr) { // �Ű�����=�迭
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	static int sumArr(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // ��� ����� ��
		}
		return sum;
	}

	static void sortArr(int[] arr) { // �迭�� �������� ����
		for (int i = 0; i < arr.length - 1; i++) { // �迭�� ũ�⸸ŭ �ݺ�
			for (int j = 0; j < arr.length - 1 - i; j++) { // ���� ������ ���� �ִ밪, ��x
				if (arr[j] > arr[j + 1]) { // ������ �� ���� ���Ͽ� ���� ���� �� ũ�� ū���� ���������� ����
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					printArr(arr);
				}
			}
		}
	}

}
