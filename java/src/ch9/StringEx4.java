package ch9;

import java.util.StringJoiner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog,cat,bear";
		String[] arr = animals.split(","); // ,을 기준으로 나눠서 배열에 저장

		System.out.println(String.join("-", arr)); // 배열 요소 사이에 - 로 연결

		StringJoiner sj = new StringJoiner("/", "[", "]"); // 양 끝에 [] 추가, 사이에 /로 구분
		for (String s : arr) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
