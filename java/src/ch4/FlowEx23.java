package ch4;

public class FlowEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;

		// for와 while은 항상 서로 변환 가능

		// while (i-- != 0) { //4,3,2,1,0
		while (--i != 0) { // 4,3,2,1
			System.out.println(i + "- I can do it");
		}
	}

}
