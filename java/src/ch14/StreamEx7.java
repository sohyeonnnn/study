package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student7 {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;

	Student7(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %3d��]", name, isMale ? "��" : "��", hak, ban, score);
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}

	enum Level {
		HIGH, MID, LOW
	}
}

public class StreamEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student7[] stuArr = { new Student7("���ڹ�", true, 1, 1, 300), new Student7("������", false, 1, 1, 250),
				new Student7("���ڹ�", true, 1, 1, 200), new Student7("������", false, 1, 2, 150),
				new Student7("���ڹ�", true, 1, 2, 100), new Student7("������", false, 1, 2, 50),
				new Student7("Ȳ����", false, 1, 3, 100), new Student7("������", false, 1, 3, 150),
				new Student7("���ڹ�", true, 1, 3, 200),

				new Student7("���ڹ�", true, 2, 1, 300), new Student7("������", false, 2, 1, 250),
				new Student7("���ڹ�", true, 2, 1, 200), new Student7("������", false, 2, 2, 150),
				new Student7("���ڹ�", true, 2, 2, 100), new Student7("������", false, 2, 2, 50),
				new Student7("Ȳ����", false, 2, 3, 100), new Student7("������", false, 2, 3, 150),
				new Student7("���ڹ�", true, 2, 3, 200) };

		System.out.printf("1. �ܼ�����(������ ����)%n");
		Map<Boolean, List<Student7>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student7::isMale));

		List<Student7> maleStudent = stuBySex.get(true);

		List<Student7> femaleStudent = stuBySex.get(false);
		for (Student7 s : maleStudent)
			System.out.println(s);
		for (Student7 s : femaleStudent)
			System.out.println(s);

		System.out.printf("%n2. �ܼ����� + ���(���� �л���)%n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student7::isMale, counting()));

		System.out.println("���л���:" + stuNumBySex.get(true));
		System.out.println("���л���:" + stuNumBySex.get(false));

		System.out.printf("%n3. �ܼ����� + ���(���� 1��)%n");
		Map<Boolean, Optional<Student7>> topScoreBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student7::isMale, maxBy(comparingInt(Student7::getScore))));

		System.out.println("���л� 1��:" + topScoreBySex.get(true));
		System.out.println("���л� 1��:" + topScoreBySex.get(false));

		Map<Boolean, Student7> topScoreBySex2 = Stream.of(stuArr).collect(partitioningBy(Student7::isMale,
				collectingAndThen(maxBy(comparingInt(Student7::getScore)), Optional::get)));

		System.out.println("���л� 1��:" + topScoreBySex2.get(true));
		System.out.println("���л� 1��:" + topScoreBySex2.get(false));

		System.out.printf("%n4. ���ߺ���(���� ���հ���, 100�� ����)%n");
		Map<Boolean, Map<Boolean, List<Student7>>> failedStuBySex = Stream.of(stuArr)
				.collect(partitioningBy(Student7::isMale, partitioningBy(s -> s.getScore() <= 100)));

		List<Student7> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Student7> failedFemaleStu = failedStuBySex.get(false).get(true);

		for (Student7 s : failedMaleStu)
			System.out.println(s);
		for (Student7 s : failedFemaleStu)
			System.out.println(s);

	}

}
