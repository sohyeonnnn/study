package ch15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자로 데이터를 저장하면, 다시 데이터를 불러올때 문자들을 실제 값으로 변환하는 과정을 거쳐야하고,
		// 읽어야할 데이터의 개수를 결정해야하는 번거로움이 있음
		// ->DataInputStream과 DataOutputStream을 사용하면 데이터를 변환할 필요도 없고,
		// 자리수를 세어서 따지지않아도 되므로 편리함
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
