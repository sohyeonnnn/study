package ch11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
//TreeSet은 이진 검색 트리라는 자료구조의 형태로 데이터를 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		// treeSet은 저장할때 이미 정렬하기 때문에 읽어올때 따로 정렬할 필요가 없다
		System.out.println(set);
	}

}
