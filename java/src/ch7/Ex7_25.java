package ch7;

//�������̽��� ����
//1.ǥ��ȭ�� �����ϰ� ���ش�
//2. ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� ���ִ�
//3. �������� ���α׷����� �����ϴ�
//4. ���߻���� �����ϰ� ���ش�

class Outer25 {
	class Inner25 {
		int iv = 100;
	}
}

public class Ex7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inner�� ������� iv ���� ����Ϸ���
		// outer�ν��Ͻ� ����
		Outer25 outer = new Outer25();
		// outer�� inner ����
		Outer25.Inner25 inner = outer.new Inner25();
		System.out.println(inner.iv);
	}
	//����Ŭ������ �ν��Ͻ��� �����ϱ� ���ؼ��� ���� �ܺ�Ŭ������ �ν��Ͻ� ����

}
