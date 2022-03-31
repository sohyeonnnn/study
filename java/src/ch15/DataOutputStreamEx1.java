package ch15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("sample.dat"); // sample.dat를 출력하는 스트림
			// 이진 데이터로 저장된다
			dos = new DataOutputStream(fos); // 보조스트림
			// 8가지 자료형의 단위로 읽고 쓸수있다
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			// close로 자원반환
			dos.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
