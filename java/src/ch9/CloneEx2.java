package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arrClone = arr.clone(); // 배열 복제
		arrClone[0] = 6; // 0번째 요소 값 변경

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
