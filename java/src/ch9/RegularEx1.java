package ch9;

import java.util.regex.*;

public class RegularEx1 {

	// ���Խ� - �ؽ�Ʈ ������ �߿��� ���ϴ� ���ǰ� ��ġ�ϴ� ���ڿ��� ã�Ƴ��� ���� ���

	// data��� ���ڿ��迭�� ��� ���ڿ� �߿��� ������ ���Խİ� ��ġ�ϴ� ���ڿ��� ����ϴ� ����
	// Pattern�� ���Խ��� �����ϴµ� ���ǰ�, Mathcher�� ���Խ��� �����Ϳ� ���ϴ� ����

	// 1.���Խ��� �Ű������� patternŬ������ compile�� ȣ���Ͽ� pattern�ν��Ͻ� ����
	// 2.���Խ����� ���� ����� �Ű������� patternŬ������ matcher�� ȣ���Ͽ� matcher�ν��Ͻ� ����
	// 3.matcher�ν��Ͻ��� matches�� ȣ���ؼ� ���ԽĿ� �����ϴ��� Ȯ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc" };
		Pattern p = Pattern.compile("c[a-z]*"); // c�� �����ϴ� �ҹ��ڿ��ܾ�

		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {
				System.out.print(data[i] + ",");
			}
		}

	}

}
