package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for�� ��� arraycopy()�� ����ϸ� ���� �����ϰ� ������ �迭�� ������ �� �ִ�
		// for���� �迭�� ��� �ϳ��ϳ��� �����ؼ� ����������, arraycopy�� ������ ������ ������ �� ���� ��°�� ����

		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);

		// �迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // abc�� result�� ����
		System.arraycopy(num, 0, result, abc.length, num.length); // num�� result�� ����
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);// abc�� num�� ù��° ��ġ���� abc�� ���̸�ŭ ����
		System.out.println(num);

		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
