package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "��ʸ���õ��ʿ�";
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}

	public static long hangulToNum(String input) {
		long result = 0; // ���� ��ȯ����� �����ϱ� ���� ����
		long tmpResult = 0; // �ʹ�õ ������ ���� �����ϱ� ���� �ӽú���
		long num = 0;

		final String NUMBER = "�����̻�����ĥ�ȱ�";
		final String UNIT = "�ʹ�õ������";
		final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long) 1e8, (long) 1e12 };

		StringTokenizer st = new StringTokenizer(input, UNIT, true); // '��ʸ���õ��ʿ�'�� '�ʹ�õ������'�� ����
		// true -> �����ڵ� ��ū���� ������
		// �� �� �� �� õ �� �� ��

		while (st.hasMoreTokens()) {
			String token = st.nextToken(); //
			int check = NUMBER.indexOf(token); // �������� Ȯ��, ������ -1

			// token �� �� �� �� õ �� �� ��
			// System.out.println(check);

			// ��ū�� ���ڸ� num�� ����, ������ num�� ������ ���ؼ� tmpResult�� ����
			if (check == -1) { // �����϶�
				if ("������".indexOf(token) == -1) { // ��ū�� ��,��,�� �����϶�
					tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
					//num�� 0�̸� 1�� �ٲ���
					
				} else {
					// ����õ�� ���� ���� ���� �ٷ� ������ �����ϴ� ��쿡�� num�� 0�̱� ������ ������ ���ص� �� ����� 0
					// ���׿����ڸ� �̿��ؼ� num�� ���� 1�� �ٲ��� ������ ���Ѵ�
					tmpResult += num;
					result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			} else {
				num = check; // �����϶� num�� ����
			}
		}
		return result + tmpResult + num;
	}

}
