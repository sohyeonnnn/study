package ch11;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");

		System.out.println(set); // 모두 출력, 정렬o, 공백-숫자-대문자-소문자 순서
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to)); // 소문자 b,c로 시작하는 단어
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}

}
