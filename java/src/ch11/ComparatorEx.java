package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	// compareTo�� ��ȯ��
	// �� ��ü�� ������ 0 / ���ϴ� ������ ������ ���� / ũ�� ���

	// Comparable - �⺻ ���ı����� �����ϴµ� ���
	// Comparator - �⺻ ���ı��� �ܿ� �ٸ��������� �����ϰ����Ҷ� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // String�� Comparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr)); // �빮�� ����

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);// ��ҹ��� ���о��� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());// ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ�
											// c2.compareTo(c1)�� ���� ������ �ٲ㵵 �ȴ�
		}
		return -1;
	}
}
