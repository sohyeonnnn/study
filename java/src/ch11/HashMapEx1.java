package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // Ű ���� ����, �����

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է����ּ���");
			System.out.print("id: ");
			String id = s.nextLine().trim();

			System.out.print("password: ");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) { // Ű ���� ���̵� �����ϴ��� Ȯ��
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if (!(map.get(id)).equals(password)) { // id�� Ű������ �ϴ� value�� �����ͼ� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�");
					break;
				}
			}
		}
	}

}
