package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx4 {

	// ���ڿ� �迭�� ��� ���ڿ��� �ϳ��� �о HashMap�� Ű�� �����ϰ� ������ 1�� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) { // ���ڿ��� Ű�� ����Ǿ��ִ��� Ȯ��(�̹� put�ߴ��� Ȯ��)
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1)); // �� 1 ���� -> ���ڿ��� �󵵼�
			} else {
				map.put(data[i], new Integer(1)); // put�� ���� ������ �� 1�� ����
			}
		}

		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) { // �ϳ��� ������
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue(); // ���� ������
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch; // ���ڸ�ŭ ���� ���
		}
		return new String(bar);
	}

}
