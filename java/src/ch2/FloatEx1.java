package ch2;

public class FloatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		// ����ӵ��� ��󿡳� �޸𸮸� �����Ϸ��� float����
		// �� ū ���� ������, �� ���� ���е��� �ʿ��ϴٸ� double
		System.out.printf("		123456789012345678901234%n");
		System.out.printf("f: %f%n", f); //�⺻������ �Ҽ��� ���� 6�ڸ����� ���, 7��° �ڸ����� �ݿø�
		System.out.printf("f: %24.20f%n", f);  //��ü 24�ڸ� �߿��� 20�ڸ��� �Ҽ��� ������ �� ���
		System.out.printf("f2: %24.20f%n", f2);
		System.out.printf("d: %24.20f%n", d);
	}

}
