package ch6;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ReferencReturnEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d);

		System.out.println("d.x=" + d.x);
		System.out.println("d2.x=" + d2.x); // �� ���� ���� ����

	}

	static Data copy(Data d) { // ��ü�� �Ű������� ����
		Data tmp = new Data(); // ���ο� ��ü ����
		tmp.x = d.x; // ��ü �� ����

		return tmp; // ��ü�� ��ȯ-��ȯŸ�� ������ ����
		// �޼��尡 ��ü�� �ּҸ� ��ȯ
		// copy�޼��尡 ����Ǹ鼭 ��ȯ�� tmp�� ���� �������� d2�� ����
		// copy�� ����Ǹ� tmp�� ��������� d2�� ���ο� ��ü�� �ٷ� �� �ִ�
	}

}
