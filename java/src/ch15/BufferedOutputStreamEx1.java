package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			// BufferedOutputStream의 버퍼 크기를 5로 한다
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt에 1 부터 9까지 출력
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}

			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
//버퍼에 남아있는 데이터가 출력되지 못한 상태로 프로그램이 종료되어 5까지만 출력
}
