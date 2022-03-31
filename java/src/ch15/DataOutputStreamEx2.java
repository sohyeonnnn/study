package ch15;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

public class DataOutputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte������ ������ ��ȯ �� ������ ����
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;

		byte[] result = null;

		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			// 8���� �⺻ �ڷ����� ������ �а��� ����
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);

			result = bos.toByteArray();

			String[] hex = new String[result.length];

			for (int i = 0; i < result.length; i++) {
				if (result[i] < 0) {
					hex[i] = String.format("%02x", result[i] + 256);
				} else {
					hex[i] = String.format("%02x", result[i]);
				}
			}
			System.out.println("10����:" + Arrays.toString(result));
			System.out.println("16����:" + Arrays.toString(hex));

			dos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
