package ch6;

//객체지향 - 재사용성 높음, 코드관리 용이, 높은 신뢰성

public class TvTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t를 선언, 아직 인스턴스 생성 전이라 아무것도 할 수 없음
		t = new Tv(); // Tv 인스턴스 생성 - 연산자 new 사용, 각 자료형의 기본값으로 초기화
		t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다
		t.channelDown(); // Tv인스턴스의 메서드 channelDown을 호출
		System.out.println("현재 채널은 " + t.channel + "입니다");

		// 인스턴스는 참조변수를 통해서만 다룰 수 있으며,
		// 참조변수의 타입은 인스턴스의 타입과 일치해야함
	}

}
