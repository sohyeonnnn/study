package ch5;

public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0~9수를 num배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) { 
			counter[numArr[i]]++; // 해당 숫자의 개수만큼 값이 증가함
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수: " + counter[i]);
		}
	}

}
