package ch11;

import java.util.TreeSet;

public class TreeSetEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}

		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: " + set.tailSet(new Integer(50)));
	}

	// headSet메서드와 tailSet메서드를 이용하면,
	// TreeSet에 저장된 객체 중 지정된 기준 값보다 큰 값의 객체들과 작은 값의 객체들을 얻을수있다
}
