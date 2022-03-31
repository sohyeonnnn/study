package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		// ����
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		// ����
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = 0;

		// data�� ����� ���� -1���� check, read�� �� �̻� �о� �� �����Ͱ� ������ -1 ��ȯ
		while ((data = input.read()) != -1) { 
			output.write(data); //data�� write
		}

		outSrc = output.toByteArray(); // ��Ʈ���� ������ byte�迭�� ��ȯ

		System.out.println("Input Source: " + Arrays.toString(inSrc));
		System.out.println("Output Source: " + Arrays.toString(outSrc));

	}
}
