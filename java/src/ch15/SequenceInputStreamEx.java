package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class SequenceInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] arr1 = { 0, 1, 2 };
		byte[] arr2 = { 3, 4, 5 };
		byte[] arr3 = { 6, 7, 8 };
		byte[] outSrc = null;

		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));

		// 여러개의 입력스트림을 연속적으로 연결해서 하나의 스트림으로부터 데이터를 읽는 것과 같이 처리
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int data = 0;

		try {
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}

		outSrc = output.toByteArray();

		System.out.println("Input Source1:" + Arrays.toString(arr1));
		System.out.println("Input Source2:" + Arrays.toString(arr2));
		System.out.println("Input Source3:" + Arrays.toString(arr3));
		System.out.println("output Source:" + Arrays.toString(outSrc));
	}

}
