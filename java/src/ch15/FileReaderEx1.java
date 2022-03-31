package ch15;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);

			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			fis.close();

			while ((data = fr.read()) != -1)
				System.out.print((char) data);
			System.out.println();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
