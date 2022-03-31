package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요> ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1; // 0부터 시작이므로 +1, double값을 반환하므로 형변환

		System.out.println("당신은 " + user + "입니다");
		System.out.println("컴은 " + com + "입니다");

		// 이기는 경우
		// 유저: 가위1 바위2 보3
		// 컴: 보3 가위1 바위2
		// user-com : -2,1

		// 지는 경우
		// 유저: 가위1 바위2 보3
		// 컴: 바위2 보3 가위1
		// user-com : -1,2

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			// break; //마지막 문장이라 break 사용할 필요 없음
		}
	}

}
