package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

interface Eatable {
}

//FruitBox���� Fruit�� �ڼ��̸鼭 Eatable�� ������ Ŭ������ T�� ���԰���
class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

	ArrayList<T> getList() {
		return list;
	}
}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		Box<Toy> toyBox = new Box<Toy>();
		// Ÿ���� ��ġ�ؾ��Ѵ�

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());

		// appleBox.add(new Apple()); // appleBox���� Apple�� ����������
		// toyBox.add(new Toy()); // toyBox���� Toy�� ����������

		System.out.println("fruit" + fruitBox);
		System.out.println("apple" + appleBox);
		System.out.println("grape" + grapeBox);

	}

}
