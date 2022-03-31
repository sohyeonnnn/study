package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMenu {
	Scanner sc = new Scanner(System.in);

	private User user;
	private List<User> userList = new ArrayList<>();

	private GameFunc gameFunc;

	// 사용자 아이디 입력
	private String inputUserId() {
		System.out.print("[id] : ");
		return sc.nextLine();
	}

	// 있는 아이디이면
	private User getUser(String id) {
		if (checkId(id)) {// 있는 아이디
			return getUser(id);
		}
		// 없는 아이디면
		return makeUser(id);
	}

	// 이미 있는 아이디인지 확인
	private boolean checkId(String id) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId().equals(id)) { // 원래 있는 아이디이면
				return true; // 있으면 true
			}
		}
		return false;
	}

	// 해당 id 사용자 인스턴스 생성 후 리스트에 추가
	private User makeUser(String id) {
		user = new User();
		user.setId(id);
		userList.add(user);
		return user;
	}

	// 메뉴 출력
	private void showMenu() {
		System.out.printf("%n==== baseball game ====%n");
		System.out.println("1. 게임 시작");
		System.out.println("2. 순위 보기");
		System.out.println("3. 다른 id로 접속"); // !!!!!!!!!!!!!!!!
		System.out.println("4. 종료	");
		System.out.print("======================= > 선택 : ");
	}

	// 메뉴 선택
	private boolean selectMenu() {
		switch (sc.nextInt()) {

		case 2:
			showScore();
			gameStart();

		case 1:
			break;

		case 3:
			inputUserId();
			/*
			 * gameFunc = new GameFunc(checkId(inputUserId())); gameFunc.gameStart();
			 */
			/* return true; */
			break;
		case 4:
			System.out.println("===== bye! =====");
			return false;
		}
		return true;
	}

	protected void gameStart() {
		if (user == null) {
			checkId(inputUserId());
		}
		showMenu();
		if (selectMenu()) {
			gameFunc = new GameFunc(user);
			gameFunc.gameStart();
		}
		// 게임 끝나면 메뉴 다시 보여주기

	}

	// 순위 출력
	private void showScore() {
		System.out.printf("순위\tid\tscore%n");
		for (int i = 0; i < userList.size(); i++) {
			System.out.printf("%d위\t%s\t%d%n", i + 1, userList.get(i).getId(), userList.get(i).getScore());
		}
	}

}
