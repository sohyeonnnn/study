package ch8;

//컴파일 에러: 컴파일 했을때 발생
//런타임 에러: 실행 했을때 발생
//에러: 프로그램 코드에 의해 수습될 수 없는 심각한 오류
//오류: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

//예외처리 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는것이 목적
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {// 예외가 발생할 가능성이 있는 문장
			try {
			} catch (Exception e) {
			}
		} catch (Exception e) {
			try {
			} catch (Exception e2) {
			} // 에러 - 변수e가 중복선언
		}

	}
}