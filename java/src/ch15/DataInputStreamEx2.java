package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);

			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {// 더 이상 읽을 데이터가 없으면 발생
			// TODO: handle exception
			System.out.println("점수의 총합은 " + sum + "입니다");
		} catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException ie) {
				// TODO: handle exception
				ie.printStackTrace();
			}
		}
	}

}
