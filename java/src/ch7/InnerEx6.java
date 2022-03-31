package ch7;

//익명클래스
//클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 
//오직 하나의 객체만을 생성할 수 있는 일회용 클래스

//이름이 없기 때문에 생성자x
//단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현

public class InnerEx6 {
	Object iv = new Object() { // 익명클래스
		void method() {
		}
	};
	static Object cv = new Object() {// 익명클래스
		void method() {
		}
	};

	void myMethod() {
		Object lv = new Object() {// 익명클래스
			void method() {
			}
		};
	}
}
