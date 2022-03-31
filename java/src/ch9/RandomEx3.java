package ch9;

import java.util.Arrays;

public class RandomEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print(getRand(5, 10) + ",");
		}
		System.out.println();
		int[] result = fillRand(new int[10], new int[] { 2, 3, 7, 5 });
		System.out.println(Arrays.toString(result));
	}

	// �迭 arr�� from�� to������ ����� ä���� ��ȯ
	public static int[] fillRand(int[] arr, int from, int to) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	}

	// �迭 arr�� �迭 data�� �ִ� ����� ä���� ��ȯ
	public static int[] fillRand(int[] arr, int[] data) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data[getRand(0, data.length - 1)];
		}
		return arr;
	}

	// from�� to������ �������� ��ȯ, from<= <=to
	public static int getRand(int from, int to) {
		return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
	}
}
