package ch4;

public class FlowE24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		System.out.println("카운트다운을 시작합니다");
		while(i--!=0) {
			System.out.println(i); //10~0
			for(long j=0;j<2000000000l;j++) { //출력간 지연시간
				;
			}
		}
		System.out.println("game over");
	}

}
