package ch9;

class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // kind�� number�� ����ϵ��� �������̵�
		return "kind:" + kind + ", number:" + number;
	}
}

public class CardToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c1 = new Card2(); // �⺻�����ڿ� ���� spade,1 ���� �ʱ�ȭ
		Card2 c2 = new Card2("HEART", 10); // heart,10 ���� �ʱ�ȭ
		System.out.println(c1.toString()); // ���
		System.out.println(c2.toString());

	}

}
