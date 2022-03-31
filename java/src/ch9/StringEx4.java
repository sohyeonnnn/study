package ch9;

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // ,�� �������� ������ �迭�� ����

		System.out.println(String.join("-", arr)); // �迭 ��� ���̿� - �� ����

		StringJoiner sj = new StringJoiner("/", "[", "]"); // �� ���� [] �߰�, ���̿� /�� ����
		for (String s : arr) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
