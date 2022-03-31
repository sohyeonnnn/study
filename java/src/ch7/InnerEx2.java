package ch7;

class InnerEx2 {

	class InstanceInner2 {
	}

	static class StaticInner2 {
	}
	//인스턴스멤버는 static멤버 항상 접근 가능, 반대는 x

	// 인스턴스멤버 간에는 서로 직접 접근이 가능
	InstanceInner2 iv = new InstanceInner2();
	// static멤버 간에는 서로 직접 접근이 가능
	static StaticInner2 cv = new StaticInner2();

	static void staticMethod() {
		// static멤버는 인스턴스멤버에 직접 접근 불가능
		// InstanceInner2 obj1=new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();

		// 굳이 접근하려면 아래와 같이 객체를 생성
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성가능
		InnerEx2 outer = new InnerEx2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}

	void instanceMethod() {
		// 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가능
		// LocalInner lv=new LocalInner();
	}

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	}

}