package ch11;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		// abc는 중복으로 인식하여 하나만 저장됨
		// Person(David,10)은 값은 같지만 서로 다른 인스턴스이기 때문에 두번 출력

		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		// HashSet의 add메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해
		// 추가하려는 요소의 equals와 hashCode를 호출하기 때문에 두 메서드를 목적에 맞게 오버라이딩해야함
		// 두 인스턴스의 이름과 나이의 값이 같으면 true를 반환하도록 equals 오버라이딩

		System.out.println(set);
	}

}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}
