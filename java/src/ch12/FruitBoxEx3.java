package ch12;

//와일드카드
//기호로 ? 표현, 어떠한 타입도 될 수 있다
// < ? extends T> : 와일드카드의 상한 제한, T와 그 자손들만 가능
// < ?  super  T> : 와일드카드의 하한 제한, T와 그 조상들만 가능
// < ? > : 제한없음, 모든 타입이 가능, < ? extends Object>와 동일
class Fruit2 {
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape";
	}
}

class Juice {
	String name;

	Juice(String name) {
		this.name = name + "Juice";
	}

	public String toString() {
		return name;
	}
}

class Juicer {
	// makeJuice는 fruit의 자손만을 담는 fruitBox를 매개변수로 받을수있음
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";

		for (Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class FruitBoxEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); // 과일만 담을수있음
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>(); // 사과만 담을수있음

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}

}

class FruitBox2<T extends Fruit2> extends Box<T> { // 과일만 담을수있는 박스
}
