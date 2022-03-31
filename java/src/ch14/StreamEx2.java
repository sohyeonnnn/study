package ch14;

import java.io.File;
import java.util.stream.Stream;

class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"),
				new File("Ex1.txt") };
		// fileArr�� stream����
		Stream<File> fileStream = Stream.of(fileArr);

		// map���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // fileName ���

		fileStream = Stream.of(fileArr); // stream �ٽ� ����
		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1) // Ȯ���ڰ� ���� �� ����
				.map(s -> s.substring(s.indexOf('.') + 1)) // Ȯ���ڸ� ����
				.map(String::toUpperCase) // �빮�ڷ� ��ȯ
				.distinct() // �ߺ� ����
				.forEach(System.out::print); // ���

		System.out.println();

	}

}
