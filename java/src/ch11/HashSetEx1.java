package ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	// HashSet�� �ߺ��� ��� ����x, ������� ����x (�����Ϸ��� LinkedHashSet)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		// �ߺ��� ���� ������� ����
		// 1 �ϳ��� ���ڿ�, �ϳ��� ����
		// ������ �������� ����
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}

		// HashSet�� ����� ��ҵ��� ���
		System.out.println(set);
	}
}
