package ch11;

import java.util.Arrays;

public class ArraysEx {

	// Arrays클래스 - 배열을 다루는데 유용한 메서드

	// copyOf,copyOfRange - 배열 전체, 배열 일부를 복사해서 새로운 배열을 만들어 반환
	// fill,setAll - 모든 요소를 지정된 값으로 채움, 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받음
	// sort - 배열 정렬
	// equals,toString - 모든 요소를 문자열로 출력 (다차원 배열에서는 deepToString, deepEquals사용)
	// parallel - 여러 쓰레드가 작업을 나누어 처리하여 빠른 결과
	// spliterator - 여러 쓰레드가 처리할 수 있게 하나의 작업을 여러 작업으로 나누는 spliterator를 반환
	// stream - 컬렉션을 스트림으로 변환

	// binarySearch - 배열에 저장된 요소를 검색, 배열이 정렬된 상태이어야 올바른 결과 얻음
	// 순차검색 - 첫번째 요소부터 순서대로 하나씩 검색, 정렬할 필요 없음, 하나씩 비교하기 때문에 시간이 오래걸림
	// 이진검색 - 배열의 검색할 범위를 반복적으로 절반씩 줄여가면서 검색, 속도 빠름, 배열이 정렬되어있어야함

	// asList - 배열을 List에 담아서 반환
	// 반환한 List의 크기를 변경할수 없음, 추가/삭제 불가능, 저장된 나용은 변경가능
	// 크기를 변경할 수 있는 List가 필요하다면
	// List list=new ArrayList(Arrays.asList(1,2,3,4,5));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println("arr=" + Arrays.toString(arr)); // 문자열로 반환
		System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // 다차원배열 문자열로 반환

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr을 arr길이만큼 arr2에 복사
		int[] arr3 = Arrays.copyOf(arr, 3); // 3개만 복사
		int[] arr4 = Arrays.copyOf(arr, 7); // 7개만 복사
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 2번째 요소부터 3번째 요소까지
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 0번째 요소부터 6번째 요소까지

		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));

		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // 길이 5인 배열을 9로 채운다
		System.out.println("arr7=" + Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // 랜덤1~6수를 배열에 저장
		System.out.println("arr7=" + Arrays.toString(arr7));

		for (int i : arr7) { // arr7의 요소=i
			char[] graph = new char[i]; // 크기i의 배열
			Arrays.fill(graph, '*'); // 배열을 *로 채운다
			System.out.println(new String(graph) + i); // 배열 출력
		}

		String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(Arrays.equals(str2D, str2D2)); // false - 다차원 배열 비교는 equal로 안된다
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B')); // 정렬하지 않아서 잘못된 결과
		System.out.println("== after sorting ==");
		Arrays.sort(chArr); // 정렬
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));

	}

}
