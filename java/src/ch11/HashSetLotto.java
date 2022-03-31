package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1; // 1~45 ���� ���� 6�� set�� ����
			set.add(new Integer(num));
		}

		// sort�� ���ڷ� List�������̽� Ÿ���� �ʿ�� �ϱ� ������ linkedlist�� ��Ƽ� ó��
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); // ����
		System.out.println(list);
	}

}
