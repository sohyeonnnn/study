package ch7;

import ch7.Outer27.Inner27;

class Outer27 {
	int value = 10;

	class Inner27 {
		int value = 20;

		void method1() {
			int value = 30;

			System.out.println(value); // 30: method1�� value��
			System.out.println(this.value);// 20: inner�� value
			System.out.println(Outer27.this.value);// 10: outer�� value
		}
	}// inner
}// outer

public class Ex7_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer27 outer = new Outer27(); // inner���� ���� outer�ν��Ͻ� ����
		Inner27 inner = outer.new Inner27(); // inner ����
		inner.method1();

	}

	
	//�ܺ�Ŭ������ ����Ŭ������ ���� �̸��� �ν��Ͻ� ������ ����Ǿ����� 
	//outer.this.�����̸�
}
