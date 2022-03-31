package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // 키 값이 같음, 덮어쓰기

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id: ");
			String id = s.nextLine().trim();

			System.out.print("password: ");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) { // 키 값에 아이디가 존재하는지 확인
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if (!(map.get(id)).equals(password)) { // id를 키값으로 하는 value을 가져와서 비밀번호와 일치하는지 확인
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다");
					break;
				}
			}
		}
	}

}
