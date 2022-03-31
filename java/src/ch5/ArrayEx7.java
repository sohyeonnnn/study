package ch5;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		System.out.print("원래배열:");
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 0~9 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9 임의의 수
			// 배열 값들의 순서를 임의로 섞는다
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.print("변경 후:");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
