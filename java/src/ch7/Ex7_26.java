package ch7;

class Outer26 {
	static class Inner26 {
		int iv = 200;
	}
}

public class Ex7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// outerŬ������ ����Ŭ���� inner�� ������� iv�� ���
		
		//static Ŭ������ �ܺ�Ŭ������ �ν��Ͻ��� �������� �ʰ� ��� ����
		Outer26.Inner26 inner = new Outer26.Inner26();
		System.out.println(inner.iv);
	}

}
