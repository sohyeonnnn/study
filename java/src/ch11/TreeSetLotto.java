package ch11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
//TreeSet�� ���� �˻� Ʈ����� �ڷᱸ���� ���·� �����͸� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		// treeSet�� �����Ҷ� �̹� �����ϱ� ������ �о�ö� ���� ������ �ʿ䰡 ����
		System.out.println(set);
	}

}
