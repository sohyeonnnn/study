package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڷ� �����͸� �����ϸ�, �ٽ� �����͸� �ҷ��ö� ���ڵ��� ���� ������ ��ȯ�ϴ� ������ ���ľ��ϰ�,
		// �о���� �������� ������ �����ؾ��ϴ� ���ŷο��� ����
		// ->DataInputStream�� DataOutputStream�� ����ϸ� �����͸� ��ȯ�� �ʿ䵵 ����,
		// �ڸ����� ��� �������ʾƵ� �ǹǷ� ����
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);

			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
