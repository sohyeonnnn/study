package ch15;

import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("���� �������� ��ġ:" + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("���� �������� ��ġ:" + raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("���� �������� ��ġ:" + raf.getFilePointer());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
