package ch7;

import java.awt.Desktop.Action;

public class Ex7_18 {

	static void action(Robot r) { // 인스턴스를 생성하지 않고도 접근할수있도록 static
		if (r instanceof DanceRobot) // 인스턴스 타입 확인하고 형변환후 그에 따른 메서드 호출
			((DanceRobot) r).dance();
		else if (r instanceof SingRobot)
			((SingRobot) r).sing();
		else if (r instanceof DrawRobot)
			((DrawRobot) r).draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		// 로봇 배열에 로봇인스턴스 생성해서 저장

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]); // dance,sing,draw 순서로 메서드 호출
		}
	}
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
}
