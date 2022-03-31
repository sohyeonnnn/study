package ch6;

public class StaticBlockTest {

	static int[] arr = new int[10]; // 명시적 초기화 - 배열 arr생성

	static { // 클래스 초기화 블럭 - 랜덤으로 배열 값 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}

	}

}
