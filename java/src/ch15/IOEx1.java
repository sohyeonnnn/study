package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		// 선언
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		// 생성
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		int data = 0;

		// data에 저장된 값이 -1인지 check, read는 더 이상 읽어 올 데이터가 없으면 -1 반환
		while ((data = input.read()) != -1) { 
			output.write(data); //data를 write
		}

		outSrc = output.toByteArray(); // 스트림의 내용을 byte배열로 반환

		System.out.println("Input Source: " + Arrays.toString(inSrc));
		System.out.println("Output Source: " + Arrays.toString(outSrc));

	}
}
