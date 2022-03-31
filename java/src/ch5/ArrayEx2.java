package ch5;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// []안에 배열 크기, 0도 가능
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 };
		// int[] iArr3={100,95,80,70,60}; //new생략 가능
		char[] chArr = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < iArr1.length; i++) {
			iArr2[i] = i + 1;
		}

		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		// Arrays.toString : 배열의 모든 요소를 [요소,요소,...]와 같은 형식의 문자열로 만들어서 반환
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr); // char배열을 println으로 출력하면 각 요소가 구분자없이 그대로 출력

	}

}
