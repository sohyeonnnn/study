package ch11;

import java.util.HashSet;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) { // SutdaCard���� Ȯ��
			SutdaCard c = (SutdaCard) obj;
			return num == c.num && isKwang == c.isKwang; // ���� ī������ Ȯ���� ��� ����
		} else {
			return false;
		}
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}

	@Override
	public int hashCode() {
		// StringŬ������ hashCode()�� ȣ���Ѵ�
		// hashCode()�� �⺻ ������ Ŭ�����̸��� �޸��ּҿ� ���õ� ���������� �̷�����ֱ⶧����
		// �� ��ü�� hashCode���� ����� ���� �� ����
		// ���� ���� �ٸ� ��ü�� Ŭ������ �ν��Ͻ� ����(num,isKwang)�� ���� ������ ���� ��ü�� �ν�
		// ->equals()�� true�̾���ϰ�, hashCode()�� ����� ���ƾ��ϹǷ� �޼��带 ������ �������̵�

		// StringŬ������ hashCode()�� ��ü�� �ּҰ� �ƴ� ���ڿ��� ������ ������� �ؽ��ڵ带 �����ϹǷ�
		// ���ڿ��� ������ ������ �׻� ���� ���� �ؽ��ڵ带 ��ȯ
		return toString().hashCode();

	}

}




public class Exercise11_11 {
	// SutdaCardŬ������ HashSet�� �����ϰ� ����ϴ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		SutdaCard c3 = new SutdaCard(1, true);

		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);

		System.out.println(set);
	}

}
