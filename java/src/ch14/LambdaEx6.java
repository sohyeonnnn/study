package ch14;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

class LambdaEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻���� ����ϴ� �Լ��� �������̽��� ����
		IntSupplier s = () -> (int) (Math.random() * 100) + 1;
		IntConsumer c = i -> System.out.print(i + ", ");
		IntPredicate p = i -> i % 2 == 0;
		IntUnaryOperator op = i -> i / 10 * 10; // i�� ���� �ڸ��� ���ش�

		int[] arr = new int[10];

		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));
		printEvenNum(p, c, arr);
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
	}

	static void makeRandomList(IntSupplier s, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.getAsInt(); // get()�� �ƴ϶� getAsInt()�ӿ� ����
		}
	}

	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for (int i : arr) {
			if (p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}

	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]); // apply�� �ƴԿ� ����
		}
		return newArr;
	}
}
