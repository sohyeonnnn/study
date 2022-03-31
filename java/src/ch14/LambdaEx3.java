package ch14;

class Outer {
	int val = 10; // Outer.this.val

	class Inner {
		int val = 20; // this.val

		// 람다식 내에서 참조하는 지역변수는 final이 붙지 않았어도 상수로 간주된다
		// 람다식 내에서 지역변수 i와 val을 참조하고 있으므로 람다식 내에서나 다른 어느 곳에서도
		// 이 변수들의 값을 변경하는 일은 허용되지않는다
		void method(int i) {
			int val = 30;
			// i = 10; //에러 - 상수의 값을 변경할수 없음

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
