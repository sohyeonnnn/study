package ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";

		//�����͸� ��ü�迭�� ���� �ʱ�ȭ
		// -> �����Ͱ� �ٲ� ������ �Ź� �迭�� �����ؾ��ϰ�, �ٽ� �������� ����� �ϹǷ� ������
		Object[][] arguments = { { "���ڹ�", "02-123-1234", "27", "07-09" }, { "������", "032-333-1234", "33", "10-07" } };

		for (int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
		// ' Ȭ����ǥ�� MessageFormat�� ��Ŀ� escape���ڷ� ���Ǳ� ������ ���ڿ� msg������ Ȭ����ǥ�� ����Ϸ���
		// Ȭ����ǥ�� �������� �ι� ����ؾ� �Ѵ�
	}

}
