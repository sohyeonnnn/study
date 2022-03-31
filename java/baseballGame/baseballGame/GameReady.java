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

	// 레벨 선택 - 3,4,5가 아닌 수를 입력했을때 예외처리
	private void selectLevel() {
		System.out.printf("[ level 선택 ]  상:5 중:4 하:3 -> ");
		level = sc.nextInt();
		if (level > 5 || level < 3) {
			throw new RuntimeException();
		}
	}

	// 0~9 숫자 섞기
	private void shuffleNum() {
		int random;
		char tmp;
		// length 변수로 선언
		int arrSize = defaultNumArr.length;
		for (int i = 0; i < arrSize; i++) {
			random = (int) (Math.random() * 10);
			tmp = defaultNumArr[i];
			defaultNumArr[i] = defaultNumArr[random];
			defaultNumArr[random] = tmp;
		}
	}

	// 앞에 n개 리스트에 저장
	private void makeRandomNum() {
		System.out.print("(답: ");
		for (int i = 0; i < level; i++) {
			randomNum.add(defaultNumArr[i]);
			System.out.print(defaultNumArr[i] + " ");
		}
		System.out.println(")");
	}

	// gameFunc에 level 전달
	protected int getLevel() {
		return level;
	}

	// gameFunc에 RandomNum 전달
	protected List<Character> getRandomNum() {
		return randomNum;
	}

	// 게임 준비
	protected boolean ready() {
		try {
			selectLevel();// 자리수 선택
			shuffleNum(); // 랜덤숫자 생성
			makeRandomNum();
		} catch (Exception e) {
			System.out.printf("3,4,5 중에 선택하세요!!!!!!!%n");
			ready();
		}
		return true;
	}

}
