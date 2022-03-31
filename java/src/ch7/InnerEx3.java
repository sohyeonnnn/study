package ch7;

class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		// 내부클래스에서 외부클래스의 변수 접근 가능
		int iiv = outerIv; // 같은 클래스 안이라서 private이어도 사용 가능
		int iiv2 = outerCv;
	}

	static class StaticInner {
		// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다
		// int siv=outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		final int lv = 0;
		final int LV = 0; //1.8부터는 final 생략가능
		//상수는 constant pool에서 따로 관리 - 메서드가 종료되어도 상수 사용 가능

		class LocalInner {
			// lv 접근불가능 - lv는 메서드 종료와 함께 소멸, 내부 클래스의 객체가 지역변수보다 더 오래 존재가능
			int liv = outerIv;
			int liv2 = outerCv;
			// 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능
			// int liv3=lv; //1.8부터 final안붙여도 에러아님
			int liv4 = LV;

		}
	}
}
