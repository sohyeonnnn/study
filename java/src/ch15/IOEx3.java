package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] temp = new byte[4];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		System.out.println("Input Source:" + Arrays.toString(inSrc));

		try {
			while (input.available() > 0) { // 스트림으로부터 읽어올수있는 데이터의 크기를 반환
				//input.read(temp); // input을 temp에 저장
				// output.write(temp); //출력
				// temp에 담긴 내용을 지우고 쓰는 것이 아니라 기존의 내용 위에 덮어쓴다

				int len = input.read(temp);
				output.write(temp,0,len);
				// System.out.println("temp:"+Arrays.toString(temp));
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println();
		System.out.println("temp:" + Arrays.toString(temp));
		System.out.println("Output Source:" + Arrays.toString(outSrc));
	}

}
