package ch11;

import java.util.Iterator;

public class MyVector2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");

		System.out.println("���� ��: " + v); // 0 1 2 3 4
		Iterator it = v.iterator();
		it.next(); // 0
		it.remove(); // 0 ����
		it.next(); // 1
		it.remove(); // 1 ����

		System.out.println("���� �� : " + v); // 2 3 4
	}

}
//