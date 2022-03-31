package ch5;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10)); // 배열에 0~9사이의 임의의 값 저장
		}
		System.out.println();

		// 버블 정렬
		for (int i = 0; i < numArr.length - 1; i++) { // 배열 값이 n개면 n-1번만 확인하면 되니까 -1, 마지막 값은 최대값이기 때문에 비교할 필요 없다
			boolean changed = false; // 자리바꿈 체크 용도

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					changed = true; // 자리바꿈
				}
			}
			if (!changed) { // 더이상 자리바꿈이 일어나지 않으면 break
				break;
			}

			// 오름차순 정렬
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}

	}

}
