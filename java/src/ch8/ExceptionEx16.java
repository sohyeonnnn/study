package ch8;

import java.io.File;

public class ExceptionEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]); //입력받은 이름으로 파일 생성
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다"); //예외 처리
		}
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다");
		}
		File f = new File(fileName); // File클래스의 객체를 만든다
		// File객체의 createNewFile메서드를 이용해서 실제파일을 생성한다
		f.createNewFile();
		return f;
	}

}
