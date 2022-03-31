package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameMenu {
	Scanner sc = new Scanner(System.in);

	private User user;
	private List<User> userList = new ArrayList<>();

	private GameFunc gameFunc;

	// ����� ���̵� �Է�
	private String inputUserId() {
		System.out.print("[id] : ");
		return sc.nextLine();
	}

	// �ִ� ���̵��̸�
	private User getUser(String id) {
		if (checkId(id)) {// �ִ� ���̵�
			return getUser(id);
		}
		// ���� ���̵��
		return makeUser(id);
	}

	// �̹� �ִ� ���̵����� Ȯ��
	private boolean checkId(String id) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId().equals(id)) { // ���� �ִ� ���̵��̸�
				return true; // ������ true
			}
		}
		return false;
	}

	// �ش� id ����� �ν��Ͻ� ���� �� ����Ʈ�� �߰�
	private User makeUser(String id) {
		user = new User();
		user.setId(id);
		userList.add(user);
		return user;
	}

	// �޴� ���
	private void showMenu() {
		System.out.printf("%n==== baseball game ====%n");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. �ٸ� id�� ����"); // !!!!!!!!!!!!!!!!
		System.out.println("4. ����	");
		System.out.print("======================= > ���� : ");
	}

	// �޴� ����
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
		// ���� ������ �޴� �ٽ� �����ֱ�

	}

	// ���� ���
	private void showScore() {
		System.out.printf("����\tid\tscore%n");
		for (int i = 0; i < userList.size(); i++) {
			System.out.printf("%d��\t%s\t%d%n", i + 1, userList.get(i).getId(), userList.get(i).getScore());
		}
	}

}
