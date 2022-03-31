package ch9;

class Person {
	long id;

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id; // obj�� id���� �����ϱ� ���ؼ��� PersonŸ������ ����ȯ
		} else {
			return false; // Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ����
		}
	}

	Person(long id) {
		this.id = id;
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1 == p2) { // �ٸ� �ν��Ͻ��̱� ������ ���� ����
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}
		if (p1.equals(p2)) { // �ٸ� �ν��Ͻ����� ���� ����
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}

	}

}
