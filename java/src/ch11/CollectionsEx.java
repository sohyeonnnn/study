package ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*;

public class CollectionsEx {

	// collections
	// synchronized - �ϳ��� ��ü�� ���� �����尡 ���ÿ� ������ ��� �������� �ϰ����� �����ϱ� ���� ����ȭ �ʿ�
	// unmodifiable - ������ ��ȣ�� ���� ����Ұ�, �б�����
	// singleton - �� �ϳ��� ��ü���� �����ϴ� �÷���
	// checked - ������ ������ ��ü�� �����ϵ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);

		rotate(list, 2);
		System.out.println(list);

		swap(list, 0, 2);
		System.out.println(list);

		shuffle(list);
		System.out.println(list);

		sort(list);
		System.out.println();

		sort(list, reverseOrder());
		System.out.println(list);

		int idx = binarySearch(list, 3);
		System.out.println("index of 3=" + idx);

		System.out.println("max=" + max(list));
		System.out.println("min=" + min(list));
		System.out.println("min=" + max(list, reverseOrder()));

		fill(list, 9);
		System.out.println("list=" + list);

		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);

		System.out.println(disjoint(list, newList));

		copy(list, newList);
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);

		replaceAll(list, 2, 1);
		System.out.println("list=" + list);

		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);

		System.out.println("list2=" + list2);
	}

}
