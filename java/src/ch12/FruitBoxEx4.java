package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
	String name;
	int weight;

	Fruit4(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name + "(" + weight + ")";
	}
}

class Apple4 extends Fruit4 {
	Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit4 {
	Grape4(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple4> {
	public int compare(Apple4 t1, Apple4 t2) {
		return t2.weight - t1.weight; // 무게 내림차순
	}
}

class GrapeComp implements Comparator<Grape4> {
	public int compare(Grape4 t1, Grape4 t2) {
		return t2.weight - t1.weight; // 무게 내림차순
	}
}

class FruitComp implements Comparator<Fruit4> {
	public int compare(Fruit4 t1, Fruit4 t2) {
		return t1.weight - t2.weight; // 무게 오름차순
	}
}

// 이 예제는 Collections.sort를 이용해서 appleBox와 grapeBox에 담긴 과일을 무게별로 정렬
// static <T> void sort(List<T> list, Comparator<? super T) c)
// 타입 매개변수에 하한제한의 와일드카드 적용

//Comparator의 타입 매개변수로 T와 그 조상이 가능하다는 뜻 -> 항상 <? super T>가 따라붙는다

public class FruitBoxEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
		FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();

		appleBox.add(new Apple4("GreenApple", 300));
		appleBox.add(new Apple4("GreenApple", 100));
		appleBox.add(new Apple4("GreenApple", 200));

		grapeBox.add(new Grape4("GreenGrape", 400));
		grapeBox.add(new Grape4("GreenGrape", 300));
		grapeBox.add(new Grape4("GreenGrape", 200));

		// 무게 내림차순 정렬
		Collections.sort(appleBox.getList(), new AppleComp()); // 무게 내림차순 정렬
		Collections.sort(grapeBox.getList(), new GrapeComp()); // 무게 내림차순 정렬
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();

		// 무게 오름차순 정렬
		Collections.sort(appleBox.getList(), new FruitComp()); // 무게 오름차순 정렬
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
}

class FruitBox4<T extends Fruit4> extends Box<T> {
}
