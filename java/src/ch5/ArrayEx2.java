package ch5;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// []�ȿ� �迭 ũ��, 0�� ����
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 };
		// int[] iArr3={100,95,80,70,60}; //new���� ����
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr2[i] = i + 1;
		}

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		// Arrays.toString : �迭�� ��� ��Ҹ� [���,���,...]�� ���� ������ ���ڿ��� ���� ��ȯ
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr); // char�迭�� println���� ����ϸ� �� ��Ұ� �����ھ��� �״�� ���

	}

}
