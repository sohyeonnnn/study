package ch11;

import java.util.ArrayList;

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

//		// ������
//		for (int i = 0; i < list1.size(); i++) {
//			if (list2.contains(list1.get(i))) { // 1�� ���Ұ� 2���� ������ kyo�� �߰�
//				kyo.add(list1.get(i));
//			}
//		}
//
//		// ������
//		for (int i = 0; i < list1.size(); i++) {
//			if (!list2.contains(list1.get(i))) { // 2�� ���� 1�� ���Ҹ� cha�� �߰�
//				cha.add(list1.get(i));
//			}
//		}
//
//		// ������
//		hap.addAll(0, list1); // 1�� ��� ���Ҹ� hap�� �߰�
//		for (int i = 0; i < list1.size(); i++) {
//			for (int j = 0; j < list2.size(); j++) {
//				if (!hap.contains(list2.get(j))) { // hap�� 2�� ���Ұ� ������ �߰�
//					hap.add(list2.get(j));
//				}
//			}
//		}

		kyo.addAll(list1);
		kyo.retainAll(list2); // list1���� list2���� �����Ҹ� ����� ����

		cha.addAll(list1);
		cha.removeAll(list2); // list1���� list2 ��� ��� ����

		hap.addAll(list1); // 1 ��� �߰�
		hap.removeAll(kyo); // 2�� ��ġ�� ��� ����
		hap.addAll(list2); // 2 �߰�

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);

	}

}
