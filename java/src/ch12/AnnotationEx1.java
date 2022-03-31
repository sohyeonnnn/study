package ch12;

class Parent {
	void parentMethod() {
	}
}

class Child extends Parent {

	@Override
	void parentMethod() {
		// 조상 메서드의 이름을 잘못 적으면 -> 에러, 오버라이딩을 해야하는데 하지않아서
	}

}
