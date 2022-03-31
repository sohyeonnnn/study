package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] temp = new byte[10];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		input.read(temp, 0, temp.length); //input�� �о temp�� ����
		output.write(temp, 5, 5); // temp�� 5��° ��Һ��� 5�� �����ͼ� write

		outSrc = output.toByteArray();

		System.out.println("Input Source:" + Arrays.toString(inSrc));
		System.out.println("temp:" + Arrays.toString(temp));
		System.out.println("Output Source:" + Arrays.toString(outSrc));
	}

}
