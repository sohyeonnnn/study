package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet(); // 합집합
		HashSet setKyo = new HashSet(); // 교집합
		HashSet setCha = new HashSet(); // 차집합

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A=" + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B=" + setB);

		Iterator it = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (setA.contains(tmp)) { // B에서 하나씩 꺼내서 A에 있으면 교집합에 추가
				setKyo.add(tmp);
			}
		}

		it = setA.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (!setB.contains(tmp)) { // A에서 하나씩 꺼내서 B에 없으면 차집합에 추가
				setCha.add(tmp);
			}
		}

		it = setA.iterator();
		while (it.hasNext()) {
			setHab.add(it.next()); // A에서 하나씩 꺼내서 모두 합집합에 추가
		}

		it = setB.iterator();
		while (it.hasNext()) {
			setHab.add(it.next()); // B에서 하나씩 꺼내서 모두 합집합에 추가
		}

		System.out.println("A∩B=" + setKyo);
		System.out.println("A∪B=" + setHab);
		System.out.println("A-B=" + setCha);

	}

}
