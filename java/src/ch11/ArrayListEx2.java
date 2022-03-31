package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();

		List list = new ArrayList(length / LIMIT + 10); // 크기를 15로 여유있게 잡는다

		// 10개씩 자르기
		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {//0~9 / 10~19
				list.add(source.substring(i, i + LIMIT));
			} else {
				list.add(source.substring(i));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
