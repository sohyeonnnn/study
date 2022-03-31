package ch15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i = 4;

			while (true) {
				raf.seek(i);
				sum += raf.readInt();
				i += 16;
			}
		} catch (EOFException e) {
			// TODO: handle exception
			System.out.println("sum:" + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
