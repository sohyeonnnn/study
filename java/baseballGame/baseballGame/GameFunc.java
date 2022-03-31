package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameFunc {
	Scanner sc = new Scanner(System.in);

	private User user;

	// gameReady���� ������ ��
	private GameReady gameReady = new GameReady();
	private int level;
	private List<Character> randomNum;

	private List<Character> userNum;

	private int countTry; // �õ� Ƚ��
	private int strike;
	private int ball;

	GameFunc(User user) {
		if (gameReady.ready()) {
			// ready�� �����ϸ� gameReady���� �޾ƾ� �� ��
			level = gameReady.getLevel();
			randomNum = gameReady.getRandomNum();
		}
		this.user = user;
	}

	// ����ڿ��� ���� �Է¹���
	private void userInput() {
		userNum = new ArrayList<>(); // �ʱ�ȭ
		System.out.print(level + "�ڸ� ���� �Է��ϼ��� : ");
		String inputNum = sc.next();
		countTry++;
		for (int i = 0; i < inputNum.length(); i++) {
			userNum.add(inputNum.charAt(i));
		}
	}

	// ����� ���� �ߺ�üũ
	private void checkInputNum() {
		for (int i = 0; i < userNum.size(); i++) {

		}
	}

	// ����� �Է°��� ���� ��
	private boolean checkStrikeAndBall() {
		strike = 0;
		ball = 0;

		for (int i = 0; i < level; i++) {
			checkStrike(i);
			checkBall(i);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> [" + strike + "S " + ball + "B] ");

		if (strike == level) {
			return endGame();
		}

		return true;
	}

	// strike üũ
	private void checkStrike(int i) {
		if (userNum.get(i).equals(randomNum.get(i))) {
			strike++;
		}
	}

	// ball üũ
	private void checkBall(int i) {
		if (randomNum.indexOf(userNum.get(i)) != -1 && !userNum.get(i).equals(randomNum.get(i))) {
			ball++;
		}
	}

	// ���� ����
	private boolean endGame() {
		System.out.println("�����Դϴ�!! �õ� Ƚ�� : " + countTry);
		saveUserScore();
		return false;
	}

	// ���� ����
	private void saveUserScore() {
		if (countTry < 15) { // 15�� �õ� ���� �����̸� ����(����*����Ƚ��)
			user.setScore(level * (15 - countTry));
			return;
		}
		user.setScore(5); // �⺻ ���� 5
	}

	// ���� ����
	protected void gameStart() {
		System.out.printf("%n>>>> game start! <<<<%n");
		do { // do-while
			userInput(); // ����� �Է�
		} while (checkStrikeAndBall());

	}

}
