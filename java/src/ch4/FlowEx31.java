package ch4;

public class FlowEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) { // 3의 배수이면 i를 출력하지 않고 다음 조건으로 넘어감
				continue; // 반복문 끝으로 이동하여 다음 반복으로 넘어감, 반복문에서 특정조건을 제외할때 사용
			}
			System.out.println(i);
		}

	}

}
