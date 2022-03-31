package ch7;

class Outer26 {
	static class Inner26 {
		int iv = 200;
	}
}

public class Ex7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// outer클래스의 내부클래스 inner의 멤버변수 iv값 출력
		
		//static 클래스는 외부클래스의 인스턴스를 생성하지 않고도 사용 가능
		Outer26.Inner26 inner = new Outer26.Inner26();
		System.out.println(inner.iv);
	}

}
