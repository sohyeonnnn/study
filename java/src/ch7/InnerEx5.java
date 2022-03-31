package ch7;

class Outer5 {
	int value = 10; // Outer.this.value

	class Inner {
		int value = 20; // this.value

		void method1() {
			int value = 30;
			System.out.println("value : " + value);//method�� value
			System.out.println("this.value : " + this.value); //inner�� value
			System.out.println("Outer.this.value : " + Outer5.this.value); //outer�� value
		}
	}
}

class InnerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer5 outer = new Outer5(); //inner���� ���� outer����
		Outer5.Inner inner = outer.new Inner(); //inner�ν��Ͻ� ����
		inner.method1();
	}
}
