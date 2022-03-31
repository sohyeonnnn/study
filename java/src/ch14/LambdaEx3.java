package ch14;

class Outer {
	int val = 10; // Outer.this.val

	class Inner {
		int val = 20; // this.val

		// ���ٽ� ������ �����ϴ� ���������� final�� ���� �ʾҾ ����� ���ֵȴ�
		// ���ٽ� ������ �������� i�� val�� �����ϰ� �����Ƿ� ���ٽ� �������� �ٸ� ��� ��������
		// �� �������� ���� �����ϴ� ���� �������ʴ´�
		void method(int i) {
			int val = 30;
			// i = 10; //���� - ����� ���� �����Ҽ� ����

			MyFunction2 f = () -> {
				System.out.println("i : " + i);
				System.out.println("val : " + val);
				System.out.println("this.val : " + ++this.val); // 21
				System.out.println("Outer.this.val : " + ++Outer.this.val); // 11

			};
			f.myMethod();
		}
	}
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);

	}

}
