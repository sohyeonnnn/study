package ch9;

public class EqualsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");
			// 10���� ���� ������ �ٸ� �ν��Ͻ��̱⶧���� false
		}

		v2 = v1; // ���� �ν��Ͻ� �ּ�

		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");
		}
	}

}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}