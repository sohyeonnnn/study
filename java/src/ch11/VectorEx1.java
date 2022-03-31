package ch11;

import java.util.Vector;

//vector의 용량(capacity) 크기(size)

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v); // size : 3 / capacity : 5

		v.trimToSize(); // 빈 공간을 없앤다
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
		// capacity가 부족할경우 자동으로 기존의 크기보다 2배의 크기로 증가

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
