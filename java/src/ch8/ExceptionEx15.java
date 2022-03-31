package ch8;

import java.io.File;

public class ExceptionEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// command line���� �Է¹��� ���� �̸����� ���� ������ ����
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�");

	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�"); //�����̸� null,�����̸� ���ܹ߻�
			}
		} catch (Exception e) {
			// TODO: handle exception
			// fileName�� �������� ���, ���� �̸��� '�������.txt'�� �Ѵ�
			fileName = "�������.txt"; //���� ó��
		} finally {//finally���� ������ �߻� ���ο� ������� ������ ����
			File f = new File(fileName); //FileŬ������ ��ü�� �����
			createNewFile(f); //������ ��ü�� �̿��ؼ� ������ �����Ѵ�
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile(); //������ �����Ѵ�
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
