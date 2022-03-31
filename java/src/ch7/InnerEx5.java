package ch7;

class Outer5 {
	int value = 10; // Outer.this.value

	class Inner {
		int value = 20; // this.value

		void method1() {
			int value = 30;
			System.out.println("value : " + value);//method의 value
			System.out.println("this.value : " + this.value); //inner의 value
			System.out.println("Outer.this.value : " + Outer5.this.value); //outer의 value
		}
	}
}

class InnerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer5 outer = new Outer5(); //inner접근 위한 outer생성
		Outer5.Inner inner = outer.new Inner(); //inner인스턴스 생성
		inner.method1();
	}
}
