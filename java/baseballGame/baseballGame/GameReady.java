package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameReady {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);

	private char[] defaultNumArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	private int level;

	private List<Character> randomNum = new ArrayList<>();

	// ���� ���� - 3,4,5�� �ƴ� ���� �Է������� ����ó��
	private void selectLevel() {
		System.out.printf("[ level ���� ]  ��:5 ��:4 ��:3 -> ");
		level = sc.nextInt();
		if (level > 5 || level < 3) {
			throw new RuntimeException();
		}
	}

	// 0~9 ���� ����
	private void shuffleNum() {
		int random;
		char tmp;
		// length ������ ����
		int arrSize = defaultNumArr.length;
		for (int i = 0; i < arrSize; i++) {
			random = (int) (Math.random() * 10);
			tmp = defaultNumArr[i];
			defaultNumArr[i] = defaultNumArr[random];
			defaultNumArr[random] = tmp;
		}
	}

	// �տ� n�� ����Ʈ�� ����
	private void makeRandomNum() {
		System.out.print("(��: ");
		for (int i = 0; i < level; i++) {
			randomNum.add(defaultNumArr[i]);
			System.out.print(defaultNumArr[i] + " ");
		}
		System.out.println(")");
	}

	// gameFunc�� level ����
	protected int getLevel() {
		return level;
	}

	// gameFunc�� RandomNum ����
	protected List<Character> getRandomNum() {
		return randomNum;
	}

	// ���� �غ�
	protected boolean ready() {
		try {
			selectLevel();// �ڸ��� ����
			shuffleNum(); // �������� ����
			makeRandomNum();
		} catch (Exception e) {
			System.out.printf("3,4,5 �߿� �����ϼ���!!!!!!!%n");
			ready();
		}
		return true;
	}

}
