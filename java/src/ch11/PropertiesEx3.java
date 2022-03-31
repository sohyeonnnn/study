package ch11;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();

		prop.setProperty("timeout", "20");
		prop.setProperty("language", "�ѱ�"); // �����ڵ�� �ٲ�
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");

		try {
			// store : ����� ����� ������ outstream�� ���(����)
			prop.store(new FileOutputStream("output.txt"), "properties example");

			// storeToXML : ����� ����� ������ ��½�Ʈ���� �ش� ���ڵ��� XML������ ���
			prop.storeToXML(new FileOutputStream("output.xml"), "properties example");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
