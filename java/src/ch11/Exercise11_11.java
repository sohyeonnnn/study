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
		if (obj instanceof SutdaCard) { // SutdaCard인지 확인
			SutdaCard c = (SutdaCard) obj;
			return num == c.num && isKwang == c.isKwang; // 같은 카드인지 확인후 결과 리턴
		} else {
			return false;
		}
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}

	@Override
	public int hashCode() {
		// String클래스의 hashCode()를 호출한다
		// hashCode()의 기본 구현은 클래스이름과 메모리주소와 관련된 정수값으로 이루어져있기때문에
		// 두 객체의 hashCode값은 절대로 같을 수 없다
		// 보통 서로 다른 객체라도 클래스의 인스턴스 변수(num,isKwang)의 값이 같으면 같은 객체로 인식
		// ->equals()가 true이어야하고, hashCode()의 결과가 같아야하므로 메서드를 적절히 오버라이딩

		// String클래스의 hashCode()는 객체의 주소가 아닌 문자열의 내용을 기반으로 해시코드를 생성하므로
		// 문자열의 내용이 같으면 항상 같은 값의 해시코드를 반환
		return toString().hashCode();

	}

}




public class Exercise11_11 {
	// SutdaCard클래스를 HashSet에 저장하고 출력하는 예제
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
