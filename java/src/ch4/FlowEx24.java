package ch4;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;

		System.out.println("카운트다운을 시작합니다");

		while (i-- != 0) {
			System.out.println(i);
			// 시간 지연
			for (long j = 0; j < 2000000000l; j++) {
				;
			}
		}
		System.out.println("game over");
	}

}
