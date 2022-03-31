package ch7;

class InnerEx1 {

	class InstanceInner {
		int iv = 100;
		// static int cv=100; //에러 : static변수를 선언할 수 없다 - static클래스가 아니기때문에
		final static int CONST = 100; //final static은 상수
	}

	static class StaticInner { //이 클래스만 static변수를 사용할수있따
		int iv = 100;
		static int cv = 200; //static클래스라서 static변수 가능
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
			// static int cv=300; //static 못씀
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
