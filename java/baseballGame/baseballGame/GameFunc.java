package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameFunc {
	Scanner sc = new Scanner(System.in);

	private User user;

	// gameReady에서 가져올 값
	private GameReady gameReady = new GameReady();
	private int level;
	private List<Character> randomNum;

	private List<Character> userNum;

	private int countTry; // 시도 횟수
	private int strike;
	private int ball;

	GameFunc(User user) {
		if (gameReady.ready()) {
			// ready가 성공하면 gameReady에서 받아야 할 값
			level = gameReady.getLevel();
			randomNum = gameReady.getRandomNum();
		}
		this.user = user;
	}

	// 사용자에게 숫자 입력받음
	private void userInput() {
		userNum = new ArrayList<>(); // 초기화
		System.out.print(level + "자리 수를 입력하세요 : ");
		String inputNum = sc.next();
		countTry++;
		for (int i = 0; i < inputNum.length(); i++) {
			userNum.add(inputNum.charAt(i));
		}
	}

	// 사용자 숫자 중복체크
	private void checkInputNum() {
		for (int i = 0; i < userNum.size(); i++) {

		}
	}

	// 사용자 입력값과 정답 비교
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

	// strike 체크
	private void checkStrike(int i) {
		if (userNum.get(i).equals(randomNum.get(i))) {
			strike++;
		}
	}

	// ball 체크
	private void checkBall(int i) {
		if (randomNum.indexOf(userNum.get(i)) != -1 && !userNum.get(i).equals(randomNum.get(i))) {
			ball++;
		}
	}

	// 게임 종료
	private boolean endGame() {
		System.out.println("정답입니다!! 시도 횟수 : " + countTry);
		saveUserScore();
		return false;
	}

	// 점수 저장
	private void saveUserScore() {
		if (countTry < 15) { // 15번 시도 전에 정답이면 점수(레벨*남은횟수)
			user.setScore(level * (15 - countTry));
			return;
		}
		user.setScore(5); // 기본 점수 5
	}

	// 게임 시작
	protected void gameStart() {
		System.out.printf("%n>>>> game start! <<<<%n");
		do { // do-while
			userInput(); // 사용자 입력
		} while (checkStrikeAndBall());

	}

}
