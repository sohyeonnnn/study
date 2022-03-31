package ch4;

public class FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문에 Loop1이라는 이름을 붙인다
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) { // 222
				if (j == 5) {
					// break는 근접한 단 하나의 반복문만 벗어날 수 있음
					break Loop1;
					// break; //중첩된 for문 벗어남
					// continue Loop1; //Loop1의 조건으로 이동, 거의 쓸일없음
					// continue; //중첩된 for문 조건으로 이동
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}
