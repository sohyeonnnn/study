package ch8;

import java.io.File;

public class ExceptionEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// command line에서 입력받은 값을 이름으로 갖는 파일을 생성
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");

	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다"); //파일이름 null,공백이면 예외발생
			}
		} catch (Exception e) {
			// TODO: handle exception
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로 한다
			fileName = "제목없음.txt"; //예외 처리
		} finally {//finally블럭은 예외의 발생 여부에 관계없이 파일을 생성
			File f = new File(fileName); //File클래스의 객체를 만든다
			createNewFile(f); //생성된 객체를 이용해서 파일을 생성한다
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile(); //파일을 생성한다
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
