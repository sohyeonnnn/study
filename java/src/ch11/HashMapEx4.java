package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx4 {

	// 문자열 배열에 담긴 문자열을 하나씩 읽어서 HashMap에 키로 저장하고 값으로 1을 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) { // 문자열이 키로 저장되어있는지 확인(이미 put했는지 확인)
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1)); // 값 1 증가 -> 문자열의 빈도수
			} else {
				map.put(data[i], new Integer(1)); // put한 적이 없으면 값 1로 설정
			}
		}

		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) { // 하나씩 꺼내서
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue(); // 값을 가져옴
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch; // 숫자만큼 문자 출력
		}
		return new String(bar);
	}

}
