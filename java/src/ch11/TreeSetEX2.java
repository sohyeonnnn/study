package ch11;

import java.util.TreeSet;

public class TreeSetEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}

		System.out.println("50���� ���� ��: " + set.headSet(new Integer(50)));
		System.out.println("50���� ū ��: " + set.tailSet(new Integer(50)));
	}

	// headSet�޼���� tailSet�޼��带 �̿��ϸ�,
	// TreeSet�� ����� ��ü �� ������ ���� ������ ū ���� ��ü��� ���� ���� ��ü���� �������ִ�
}
