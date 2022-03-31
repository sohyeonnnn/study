package ch9;

public class EqualsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
			// 10으로 값은 같지만 다른 인스턴스이기때문에 false
		}

		v2 = v1; // 같은 인스턴스 주소

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}
	}

}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}