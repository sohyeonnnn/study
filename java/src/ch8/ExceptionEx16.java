package ch8;

import java.io.File;

public class ExceptionEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]); //�Է¹��� �̸����� ���� ����
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�"); //���� ó��
		}
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�");
		}
		File f = new File(fileName); // FileŬ������ ��ü�� �����
		// File��ü�� createNewFile�޼��带 �̿��ؼ� ���������� �����Ѵ�
		f.createNewFile();
		return f;
	}

}
