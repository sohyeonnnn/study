package ch14;

import java.io.File;
import java.util.stream.Stream;

class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"),
				new File("Ex1.txt") };
		// fileArr를 stream으로
		Stream<File> fileStream = Stream.of(fileArr);

		// map으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // fileName 출력

		fileStream = Stream.of(fileArr); // stream 다시 생성
		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것 제외
				.map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
				.map(String::toUpperCase) // 대문자로 변환
				.distinct() // 중복 제거
				.forEach(System.out::print); // 출력

		System.out.println();

	}

}
