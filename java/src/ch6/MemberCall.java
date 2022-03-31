package ch6;

public class MemberCall {

	int iv = 10; // 인스턴스변수
	static int cv = 20; // 클래스변수
	int iv2 = cv; // 인스턴스변수
	// static int cv2=iv; //클래스변수는 인스턴스변수를 사용 불가
	static int cv2 = new MemberCall().iv; // 객체를 생성해야 사용가능

	static void staticMethod1() {
		System.out.println(cv); // 클래스 변수이므로 사용 가능
		// System.out.println(iv); // 클래스메서드에서 인스턴스변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체를 생성한 후 사용가능
	}

	void instanceMethod1() {
		System.out.println(cv); //클래스변수
		System.out.println(iv); //인스턴스변수
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1(); //인스턴스메서드 호출 불가능
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}

	void instanceMethod2() {
		staticMethod1(); // 인스턴스메서드 호출 가능
		instanceMethod1(); // 클래스메서드 호출 가능
	}

}
