package ch11;

import java.util.ArrayList;
import java.util.Collections;

//Collection
//List : ����o  �������� ����, ������ �ߺ� ���o ex)����� ���
//Set :  ����x  �������� ����, ������ �ߺ� ���x ex) ���� ��������, �Ҽ��� ����
//Map : Ű�� ���� ������ �̷���� �������� ����, ����x, Ű:�ߺ�x, ��:�ߺ�o
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList(10); // 5,4,2,0,1,3
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 4,2,0
		print(list1, list2);

		Collections.sort(list1); // ���� 0 1 2 3 4 5
		Collections.sort(list2); //0 2 4
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //0 2 4 A B C
		print(list1, list2);

		list2.set(3, "AA"); //0 2 4 AA B C 

		// 1���� 2�� ��ġ�� �κи� ����� �������� ����
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2); //list1: 0 2 4 

		// 2���� 1�� ���Ե� ��ü���� ����
		//i�� �������Ѱ��鼭 �����ϸ�, �� ��Ұ� ������ ������ �� ������ ä��� ���� ������ ��ҵ��� �ڸ��̵� -> �ùٸ� ���x
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);  //AA B C

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
