package ch6;

import java.security.Principal;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 }; // 선언,초기화
		printArr(arr); // 배열의 모든 요소 출력
		sortArr(arr);
		printArr(arr);
		System.out.println("sum=" + sumArr(arr));

	}

	static void printArr(int[] arr) { // 매개변수=배열
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("]");
	}

	static int sumArr(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // 모든 요소의 합
		}
		return sum;
	}

	static void sortArr(int[] arr) { // 배열을 오름차순 정렬
		for (int i = 0; i < arr.length - 1; i++) { // 배열의 크기만큼 반복
			for (int j = 0; j < arr.length - 1 - i; j++) { // 가장 오른쪽 값은 최대값, 비교x
				if (arr[j] > arr[j + 1]) { // 오른쪽 옆 값과 비교하여 왼쪽 값이 더 크면 큰값을 오른쪽으로 보냄
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					printArr(arr);
				}
			}
		}
	}

}
