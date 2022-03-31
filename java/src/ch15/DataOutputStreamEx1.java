package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("sample.dat"); // sample.dat�� ����ϴ� ��Ʈ��
			// ���� �����ͷ� ����ȴ�
			dos = new DataOutputStream(fos); // ������Ʈ��
			// 8���� �ڷ����� ������ �а� �����ִ�
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			// close�� �ڿ���ȯ
			dos.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
