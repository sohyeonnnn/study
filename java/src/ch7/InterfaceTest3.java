package ch7;

class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a = new A4();
		a.methodA();

	}
}

class A4 {
	void methodA() {
		I i = InstanceManager.getInstance(); // B인스턴스 생성
		i.methodB(); // i를 통해 b에 있는 메서드 접근
		System.out.println(i.toString());
	}
}

interface I4 { // 인터페이스
	public abstract void methodB();
}

class B4 implements I { // 인터페이스 구현 클래스
	public void methodB() {
		System.out.println("methodB in B class");
	}

	public String toString() {
		return "class B";
	}
}

class InstanceManager {
	public static I getInstance() {
		return new B4(); // B를 생성해서 반환, 다른 인스턴스로 바꾸려면 여기만 수정
	}
}
