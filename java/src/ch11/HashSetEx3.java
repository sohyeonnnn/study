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

		// abc�� �ߺ����� �ν��Ͽ� �ϳ��� �����
		// Person(David,10)�� ���� ������ ���� �ٸ� �ν��Ͻ��̱� ������ �ι� ���

		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		// HashSet�� add�޼���� ���ο� ��Ҹ� �߰��ϱ� ���� ������ ����� ��ҿ� ���� ������ �Ǻ��ϱ� ����
		// �߰��Ϸ��� ����� equals�� hashCode�� ȣ���ϱ� ������ �� �޼��带 ������ �°� �������̵��ؾ���
		// �� �ν��Ͻ��� �̸��� ������ ���� ������ true�� ��ȯ�ϵ��� equals �������̵�

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
