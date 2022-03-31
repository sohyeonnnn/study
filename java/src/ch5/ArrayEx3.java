package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];

		// 배열에 1~5 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println("[변경전]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "}:" + arr[i]);
		} // 출력

		// 크기가 2배인 배열 선언, 생성
		int[] tmp = new int[arr.length * 2]; // 모든 값들이 0으로 초기화

		// 배열 arr -> tmp 복사
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}

		arr = tmp; // 참조변수 arr에 참조변수 tmp의 값을 저장 -> arr은 tmp를 가리키게 된다
		// arr과 tmp가 같은 배열을 가리키게된다, 이름만 다를 뿐 동일한 배열, arr이 가리키던 배열은 더이상 사용x

		System.out.println("[변경후]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		
		//배열 복사 : System.arraycopy(원래배열을, n번째 요소부터, 새로운배열에, x개 복사)
	}
}
