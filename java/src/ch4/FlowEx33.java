package ch4;

public class FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for���� Loop1�̶�� �̸��� ���δ�
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) { // 222
				if (j == 5) {
					// break�� ������ �� �ϳ��� �ݺ����� ��� �� ����
					break Loop1;
					// break; //��ø�� for�� ���
					// continue Loop1; //Loop1�� �������� �̵�, ���� ���Ͼ���
					// continue; //��ø�� for�� �������� �̵�
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}
