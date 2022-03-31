package ch11;

import java.util.ArrayList;

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

//		// 교집합
//		for (int i = 0; i < list1.size(); i++) {
//			if (list2.contains(list1.get(i))) { // 1의 원소가 2에도 있으면 kyo에 추가
//				kyo.add(list1.get(i));
//			}
//		}
//
//		// 차집합
//		for (int i = 0; i < list1.size(); i++) {
//			if (!list2.contains(list1.get(i))) { // 2에 없는 1의 원소를 cha에 추가
//				cha.add(list1.get(i));
//			}
//		}
//
//		// 합집합
//		hap.addAll(0, list1); // 1의 모든 원소를 hap에 추가
//		for (int i = 0; i < list1.size(); i++) {
//			for (int j = 0; j < list2.size(); j++) {
//				if (!hap.contains(list2.get(j))) { // hap에 2의 원소가 없으면 추가
//					hap.add(list2.get(j));
//				}
//			}
//		}

		kyo.addAll(list1);
		kyo.retainAll(list2); // list1에서 list2와의 공통요소만 남기고 삭제

		cha.addAll(list1);
		cha.removeAll(list2); // list1에서 list2 요소 모두 삭제

		hap.addAll(list1); // 1 모두 추가
		hap.removeAll(kyo); // 2와 겹치는 요소 삭제
		hap.addAll(list2); // 2 추가

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);

	}

}
