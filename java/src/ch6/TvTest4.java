package ch6;

public class TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� Tv��ü �迭 ����
		// ��ü �����ؼ� �迭�� ����
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10; // ä�� �����Ͽ� ����
		}
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel); // ���
		}
	}
	//�ν��Ͻ� ���� : Ŭ���� ������ ����, �ν��Ͻ��� �����ؾ� ���� �� ��� ����
	//Ŭ���� ���� : �ν��Ͻ� ���� �տ� static�� ���δ�, ��� �ν��Ͻ��� ����� ���� ����, �ν��Ͻ� �������� ��밡��, �������� ����
	//���� ����: �޼��� ���� ����Ǿ� �޼��� �������� ��� ����, ����Ǹ� �Ҹ�
}
