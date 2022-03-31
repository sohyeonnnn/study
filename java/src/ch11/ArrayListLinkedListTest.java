package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		// ���������� �߰�/�����ϴ� ��쿡�� ArrayList�� LinkedList���� ������
		// ���������� �����Ѵٴ� ���� ������ �����ͺ��� �������� �����س����ٴ°��� �ǹ�
		// ArrayList�� ������ �����ͺ��� ������ ��� �� ��ҵ��� ���ġ�� �ʿ����� �ʱ� ������ ������

		// �߰� �����͸� �߰�/�����ϴ� ��쿡�� LinkedList�� ArrayList���� ������
		// �߰� ��Ҹ� �߰� �Ǵ� �����ϴ� ���, LinkedList�� �� ��Ұ��� ���Ḹ �������ָ� �Ǳ� ������ ����

		System.out.println();
		System.out.println("=���������� �߰��ϱ�=");
		System.out.println("arrayList:" + add1(al)); //����
		System.out.println("linkedList:" + add1(ll));

		System.out.println();
		System.out.println("=�߰��� �߰��ϱ�=");
		System.out.println("arrayList:" + add2(al));
		System.out.println("linkedList:" + add2(ll)); //����

		System.out.println();
		System.out.println("=�߰����� �����ϱ�=");
		System.out.println("arrayList:" + remove2(al));
		System.out.println("linkedList:" + remove2(ll)); //����

		System.out.println();
		System.out.println("=���������� �����ϱ�=");
		System.out.println("arrayList:" + remove1(al)); //����
		System.out.println("linkedList:" + remove1(ll));
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

}
