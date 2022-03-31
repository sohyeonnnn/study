package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;

		//try-with-resource ���� �̿��ؼ� close�� ���� ȣ������ �ʾƵ� �ڵ�ȣ��ǵ��� �Ҽ��ִ�
		try (FileInputStream fis = new FileInputStream("score.dat");
				DataInputStream dis = new DataInputStream(fis)) {
			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}

		} catch (EOFException e) {
			// TODO: handle exception
			System.out.println("������ ������ " + sum + "�Դϴ�");
		} catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}
	}

}
