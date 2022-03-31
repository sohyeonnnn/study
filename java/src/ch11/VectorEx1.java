package ch11;

import java.util.Vector;

//vector�� �뷮(capacity) ũ��(size)

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v); // size : 3 / capacity : 5

		v.trimToSize(); // �� ������ ���ش�
		System.out.println();
		System.out.println("=== after trimToSize() ===");
		print(v); // size : 3 / capacity : 3

		v.ensureCapacity(6);
		System.out.println();
		System.out.println("=== after ensureCapacity(6) ===");
		print(v); // size : 3 / capacity : 6

		v.setSize(7);
		System.out.println();
		System.out.println("=== after setSize(7) ===");
		print(v); // size : 7 / capacity : 12
		// capacity�� �����Ұ�� �ڵ����� ������ ũ�⺸�� 2���� ũ��� ����

		v.clear();
		System.out.println();
		System.out.println("=== after clear() ===");
		print(v); // size : 0 / capacity : 12

	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());
		System.out.println("capacity: " + v.capacity());
	}
}
