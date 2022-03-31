package ch7;

import java.awt.Desktop.Action;

public class Ex7_18 {

	static void action(Robot r) { // �ν��Ͻ��� �������� �ʰ� �����Ҽ��ֵ��� static
		if (r instanceof DanceRobot) // �ν��Ͻ� Ÿ�� Ȯ���ϰ� ����ȯ�� �׿� ���� �޼��� ȣ��
			((DanceRobot) r).dance();
		else if (r instanceof SingRobot)
			((SingRobot) r).sing();
		else if (r instanceof DrawRobot)
			((DrawRobot) r).draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		// �κ� �迭�� �κ��ν��Ͻ� �����ؼ� ����

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]); // dance,sing,draw ������ �޼��� ȣ��
		}
	}
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�");
	}
}
