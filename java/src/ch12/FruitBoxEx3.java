package ch12;

//���ϵ�ī��
//��ȣ�� ? ǥ��, ��� Ÿ�Ե� �� �� �ִ�
// < ? extends T> : ���ϵ�ī���� ���� ����, T�� �� �ڼյ鸸 ����
// < ?  super  T> : ���ϵ�ī���� ���� ����, T�� �� ����鸸 ����
// < ? > : ���Ѿ���, ��� Ÿ���� ����, < ? extends Object>�� ����
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
	// makeJuice�� fruit�� �ڼո��� ��� fruitBox�� �Ű������� ����������
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
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); // ���ϸ� ����������
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>(); // ����� ����������

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}

}

class FruitBox2<T extends Fruit2> extends Box<T> { // ���ϸ� �������ִ� �ڽ�
}
