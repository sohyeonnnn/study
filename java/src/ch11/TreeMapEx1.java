package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapEx1 {

	// treemap은 이진검색트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장, 검색과 정렬에 적합함
	// ** 범위검색 & 정렬 **이 필요한 경우 TreeMap 사용

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		TreeMap map = new TreeMap();

		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}

		Iterator it = map.entrySet().iterator();

		System.out.println(" == 기본 정렬 ==");
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
		// TreeMap을 사용했기 때문에 키가 오름차순 정렬되어있다 A-D-K-Z
		System.out.println();

		// map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		Set set = map.entrySet();
		List list = new ArrayList(set);

		// 정렬은 기본적으로 오름차순 정렬
		// 정렬방식을 변경하려면 정렬방식을 결정하는 객체를 만들어서 sort메서드에 인수로 넘겨주면된다	
		Collections.sort(list, new ValueComparator()); // 지정된 비교자로 list를 정렬

		it = list.iterator();

		System.out.println(" == 값의 크기가 큰 순서로 정렬 ==");
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}

	static class ValueComparator implements Comparator { // 값의 크기가 큰 순서로 정렬
		public int compare(Object o1, Object o2) {
			if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry) o1;
				Map.Entry e2 = (Map.Entry) o2;

				int v1 = ((Integer) e1.getValue()).intValue();
				int v2 = ((Integer) e2.getValue()).intValue();

				return v2 - v1;
			}
			return -1;
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
}
