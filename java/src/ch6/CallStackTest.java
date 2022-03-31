package ch6;

public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		JVM메모리 구조
		JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고 , 이 메모리를 용도에 따라 여러 영역으로 나누어 관리
		1) 메서드 영역 - 클래스파일을 읽어서 분석하여 클래스에 대한 정보를 저장, 클래스변수 생성
		2) 힙 영역 - 인스턴스가 생성되는 공간, 인스턴스변수 생성
		3) 호출스택 - 메서드작업에 필요한 메모리 공간을 제공, 메서드호출되면 메모리 할당, 작업끝나면 메모리 반환
					호출스택 제일 위에 있는 메서드가 현재 실행중인 메서드
		*/
		
		firstMethod(); //static 메서드는 객체 생성없이 호출가능
		}
		
		static void firstMethod() {
			secondMethod(); //메서드 호출
		}
		
		static void secondMethod() {
			System.out.println("secondMethod");
		}
		
		
	}

