package ch7;

class A3 {
	void autoPlay(I3 i) {
		i.play(); // b,c�� �޼��带 ȣ��������, i�� ���ؼ��� ����
	}
}

interface I3 { // �������̽�
	public abstract void play(); // �߻�޼���
}

class B3 implements I3 { // �������̽� ����
	public void play() { // �������̵�
		System.out.println("play in B class");
	}
}

class C3 implements I3 { // �������̽� ����
	public void play() { // �������̵�
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();
		a.autoPlay(new B3()); // b�� play()
		a.autoPlay(new C3());// c�� play()

	}

}
