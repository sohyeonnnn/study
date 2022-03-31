package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx4 {

	// ���� �������� ����Ҷ� temp�� ����� ��� ������ ����ϴ� ��� ���� �о�� ��ŭ�� ����ϵ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] temp = new byte[4];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {
				int len = input.read(temp); // �о�� �������� ���� 4��
				output.write(temp, 0, len); // ������ŭ write
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		outSrc = output.toByteArray();
		
		System.out.println("Input Source:" + Arrays.toString(inSrc));
		System.out.println("temp:" + Arrays.toString(temp));
		System.out.println("Output Source:" + Arrays.toString(outSrc));
	}

}
