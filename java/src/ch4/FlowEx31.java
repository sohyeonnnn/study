package ch4;

public class FlowEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) { // 3�� ����̸� i�� ������� �ʰ� ���� �������� �Ѿ
				continue; // �ݺ��� ������ �̵��Ͽ� ���� �ݺ����� �Ѿ, �ݺ������� Ư�������� �����Ҷ� ���
			}
			System.out.println(i);
		}

	}

}
