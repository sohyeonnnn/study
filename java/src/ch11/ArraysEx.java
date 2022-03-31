package ch11;

import java.util.Arrays;

public class ArraysEx {

	// ArraysŬ���� - �迭�� �ٷ�µ� ������ �޼���

	// copyOf,copyOfRange - �迭 ��ü, �迭 �Ϻθ� �����ؼ� ���ο� �迭�� ����� ��ȯ
	// fill,setAll - ��� ��Ҹ� ������ ������ ä��, �迭�� ä��µ� ����� �Լ��� �������̽��� �Ű������� ����
	// sort - �迭 ����
	// equals,toString - ��� ��Ҹ� ���ڿ��� ��� (������ �迭������ deepToString, deepEquals���)
	// parallel - ���� �����尡 �۾��� ������ ó���Ͽ� ���� ���
	// spliterator - ���� �����尡 ó���� �� �ְ� �ϳ��� �۾��� ���� �۾����� ������ spliterator�� ��ȯ
	// stream - �÷����� ��Ʈ������ ��ȯ

	// binarySearch - �迭�� ����� ��Ҹ� �˻�, �迭�� ���ĵ� �����̾�� �ùٸ� ��� ����
	// �����˻� - ù��° ��Һ��� ������� �ϳ��� �˻�, ������ �ʿ� ����, �ϳ��� ���ϱ� ������ �ð��� �����ɸ�
	// �����˻� - �迭�� �˻��� ������ �ݺ������� ���ݾ� �ٿ����鼭 �˻�, �ӵ� ����, �迭�� ���ĵǾ��־����

	// asList - �迭�� List�� ��Ƽ� ��ȯ
	// ��ȯ�� List�� ũ�⸦ �����Ҽ� ����, �߰�/���� �Ұ���, ����� ������ ���氡��
	// ũ�⸦ ������ �� �ִ� List�� �ʿ��ϴٸ�
	// List list=new ArrayList(Arrays.asList(1,2,3,4,5));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

		System.out.println("arr=" + Arrays.toString(arr)); // ���ڿ��� ��ȯ
		System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // �������迭 ���ڿ��� ��ȯ

		int[] arr2 = Arrays.copyOf(arr, arr.length); // arr�� arr���̸�ŭ arr2�� ����
		int[] arr3 = Arrays.copyOf(arr, 3); // 3���� ����
		int[] arr4 = Arrays.copyOf(arr, 7); // 7���� ����
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 2��° ��Һ��� 3��° ��ұ���
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 0��° ��Һ��� 6��° ��ұ���

		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));

		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // ���� 5�� �迭�� 9�� ä���
		System.out.println("arr7=" + Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1); // ����1~6���� �迭�� ����
		System.out.println("arr7=" + Arrays.toString(arr7));

		for (int i : arr7) { // arr7�� ���=i
			char[] graph = new char[i]; // ũ��i�� �迭
			Arrays.fill(graph, '*'); // �迭�� *�� ä���
			System.out.println(new String(graph) + i); // �迭 ���
		}

		String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(Arrays.equals(str2D, str2D2)); // false - ������ �迭 �񱳴� equal�� �ȵȴ�
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B')); // �������� �ʾƼ� �߸��� ���
		System.out.println("== after sorting ==");
		Arrays.sort(chArr); // ����
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B=" + Arrays.binarySearch(chArr, 'B'));

	}

}
