package ch6;

public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		JVM�޸� ����
		JVM�� �ý������κ��� ���α׷��� �����ϴµ� �ʿ��� �޸𸮸� �Ҵ�ް� , �� �޸𸮸� �뵵�� ���� ���� �������� ������ ����
		1) �޼��� ���� - Ŭ���������� �о �м��Ͽ� Ŭ������ ���� ������ ����, Ŭ�������� ����
		2) �� ���� - �ν��Ͻ��� �����Ǵ� ����, �ν��Ͻ����� ����
		3) ȣ�⽺�� - �޼����۾��� �ʿ��� �޸� ������ ����, �޼���ȣ��Ǹ� �޸� �Ҵ�, �۾������� �޸� ��ȯ
					ȣ�⽺�� ���� ���� �ִ� �޼��尡 ���� �������� �޼���
		*/
		
		firstMethod(); //static �޼���� ��ü �������� ȣ�Ⱑ��
		}
		
		static void firstMethod() {
			secondMethod(); //�޼��� ȣ��
		}
		
		static void secondMethod() {
			System.out.println("secondMethod");
		}
		
		
	}

