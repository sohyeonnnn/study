package ch6;

class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오버로딩
		// 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있다하더라도
		// 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수있다
		// 1)메서드이름이 같아야한다
		// 2)매개변수의 개수 또는 타입이 달라야한다

		MyMath3 mm = new MyMath3();
		// add메서드가 먼저 출력되는 이유
		// println메서드가 결과를 출력하려면, add메서드의 결과가 먼저 계산되어야 하기 때문에
		// add메서드 먼저 실행한다
		System.out.println("mm.add(3,3) 결과:" + mm.add(3, 3));
		System.out.println("mm.add(3l,3) 결과:" + mm.add(3l, 3));
		System.out.println("mm.add(3,3l) 결과:" + mm.add(3, 3l));
		System.out.println("mm.add(3l,3l) 결과:" + mm.add(3l, 3l));

		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) 결과:" + mm.add(a));
	}

}

class MyMath3 {

	// 메서드 오버로딩
	// 이름은 같고, 매개변수의 개수 또는 타입이 다름
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}

	int add(int[] a) { // 배열의 모든 요소의 합을 결과로 돌려준
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
