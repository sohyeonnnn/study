package ch6;

public class StaticBlockTest {

	static int[] arr = new int[10]; // ����� �ʱ�ȭ - �迭 arr����

	static { // Ŭ���� �ʱ�ȭ �� - �������� �迭 �� ����
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
