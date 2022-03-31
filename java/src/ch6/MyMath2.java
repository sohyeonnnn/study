package ch6;

//static이 붙어있으면 클래스메서드, 아니면 인스턴스메서드
//인스턴스 메서드: 인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요로하는 메서드
//클래스 메서드: 인스턴스와 관계없는 메서드 

//1.클래스를 설계할때 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다
//2.클래스 변수는 인스턴스를 생성하지 않아도 사용할 수 있다
//3.클래스메서드는 인스턴스 변수를 사용할수없다
//4.메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다


class MyMath2 {
	long a,b;
	
	//인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다
	long add() {return a+b;} //a,b는 인스턴스 변수
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//인스턴스변수과 관계없이 매개변수만으로 작업이 가능하다
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a,long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}

class MyMathTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//매개변수를 주면서 연산
		System.out.println(MyMath2.add(200l, 100l));
		System.out.println(MyMath2.subtract(200l, 100l));
		System.out.println(MyMath2.multiply(200l, 100l));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); //객체생성 - > 값 설정
		mm.a=200l; 
		mm.b=100l;
		
		//인스턴스메서드는 객체생성 후에만 호출이 가능함
		//mm객체의 값으로 작업
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
