package ch6;

// 생성자
// 인스턴스가 생성될때 호출되는 '인스턴스 초기화 메서드'
// 1. 클래스의 이름과 같아야한다
// 2. 리턴값이 없다

// 연산자 new가 인스턴스를 생성하는것이지 생성자가 인스턴스를 생성하는 것이 아니다

class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class ConstrutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		// Data d2 = new Data2();
		// 컴파일 에러 발생!
		// Data2()가 정의되어있지 않음
		// Data2(int x)가 있어서 기본생성자가 자동으로 만들어지지않았음

		// **기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을때**
	}

}
