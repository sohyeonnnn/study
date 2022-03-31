package ch5;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length); // 0~4사이의 임의의 정수
			arr[i] = code[tmp]; // 값 구성은 같고, 길이는 10인 배열
		}
		System.out.println(Arrays.toString(arr)); // 배열을 문자열로 출력
	}

}
