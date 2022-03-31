package ch8;

public class FinallyTest {

	// finally블럭은 예외의 발생여부에 상관엇이 실행되어야할 코드를 포함시킬 목적으로 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall(); // 프로그램 설치에 필요한 준비
			copyFiles(); // 파일 복사
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일 삭제
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// 예외가 발생하더라도 임시파일들이 삭제되도록
			deleteTempFiles(); // 프로그램설치에 사용된 임시파일 삭제
		}
	}

	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다 */}

	static void copyFiles() {
		/* 파일을 복사하는 코드를 적는다 */}

	static void deleteTempFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다 */}
}
