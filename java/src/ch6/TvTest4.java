package ch6;

public class TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열 선언
		// 객체 생성해서 배열에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10; // 채널 변경하여 저장
		}
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel); // 출력
		}
	}
	//인스턴스 변수 : 클래스 영역에 선언, 인스턴스를 생성해야 변수 값 사용 가능
	//클래스 변수 : 인스턴스 변수 앞에 static을 붙인다, 모든 인스턴스가 공통된 변수 공유, 인스턴스 생성없이 사용가능, 전역변수 성격
	//지역 변수: 메서드 내에 선언되어 메서드 내에서만 사용 가능, 종료되면 소멸
}
