package ch7;

//생성자에 접근 제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있다
//생성자의 접근제어자를 private으로 지정하면, 외부에서 생성자에 접근할 수 없으므로 인스턴스를 생성할 수 없다
//대신 인스턴스를 생성해서 반환해주는 public+static 메서드를 제공함으로써 외부에서 이 클래스 인스턴스를 사용하도록 함 - 인스턴스 개수 제한 가능
// ->인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static

//생성자가 private인 클래스는 다른 클래스의 조상이 될수없다
//->자손클래스의 인스턴스를 생성할때 조상클래스의 생성자를 호출해야하는데, 생성자의 접근제어자가 private이므로 자손클래스에서 호출 불가능 
//->final 붙여서 상속할 수 없는 클래스라는 것을 알리는 것이 좋음

//제어자의 조합 주의사항
//1.메서드에 static과 abstract를 함께 사용할수없다
//2.클래스에 abstract와 final을 동시에 사용할수없다
//3.abstract메서드의 접근제어자가 private일수없다
//4.메서드에 private과 final을 같이 사용할필요없다

final class Singleton { // 생성자가 private이기 때문에 상속 불가능이기 때문에 final을 써줌
	private static Singleton s = new Singleton();

	private Singleton() { // private 생성자
		// ...
	}

	public static Singleton getInstance() { // s객체 생성해주는 메서드
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

}

class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Singleton s = new Singleton(); //생성자가 private이기 때문에 접근할수없다
		Singleton s = Singleton.getInstance(); // public static 메서드를 통해 접근

	}

}
