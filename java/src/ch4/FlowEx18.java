package ch4;

public class FlowEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%n-----%d단-----%n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i * j);
			}
		}
	}

}
