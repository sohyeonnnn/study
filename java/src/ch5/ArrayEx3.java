package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];

		// �迭�� 1~5 ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "}:" + arr[i]);
		} // ���

		// ũ�Ⱑ 2���� �迭 ����, ����
		int[] tmp = new int[arr.length * 2]; // ��� ������ 0���� �ʱ�ȭ

		// �迭 arr -> tmp ����
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}

		arr = tmp; // �������� arr�� �������� tmp�� ���� ���� -> arr�� tmp�� ����Ű�� �ȴ�
		// arr�� tmp�� ���� �迭�� ����Ű�Եȴ�, �̸��� �ٸ� �� ������ �迭, arr�� ����Ű�� �迭�� ���̻� ���x

		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		
		//�迭 ���� : System.arraycopy(�����迭��, n��° ��Һ���, ���ο�迭��, x�� ����)
	}
}
