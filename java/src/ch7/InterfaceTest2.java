package ch7;

class A3 {
	void autoPlay(I3 i) {
		i.play(); // b,c의 메서드를 호출하지만, i를 통해서만 접근
	}
}

interface I3 { // 인터페이스
	public abstract void play(); // 추상메서드
}

class B3 implements I3 { // 인터페이스 구현
	public void play() { // 오버라이딩
		System.out.println("play in B class");
	}
}

class C3 implements I3 { // 인터페이스 구현
	public void play() { // 오버라이딩
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();
		a.autoPlay(new B3()); // b의 play()
		a.autoPlay(new C3());// c의 play()

	}

}
