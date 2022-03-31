package ch11;

import java.util.ArrayList;
import java.util.Scanner;


class Exercise11_14 {

	static ArrayList record = new ArrayList(); // ���������͸� ������ ����
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
	}

	static int displayMenu() {
		System.out.println("*******************");
		System.out.println("*   �����������α׷�    *");
		System.out.println("*******************");

		System.out.println();
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("2. �л����� ����");
		System.out.print("���ϴ� �޴��� �����ϼ��� (1~3) : ");

		// ȭ�����κ��� �޴��� �Է¹޴´�. �޴��� ���� 1~3������ ��
		// 1~3������ ���� �Է¹���������, �޴��� ������ �߸��Ǿ����� �˷��ְ� �ٽ� �Է¹޴´�

		int menu = 0;

		do {
			try {
				menu = s.nextInt();

				if (menu >= 1 && menu <= 3) {
					break;
				} else {// 1~3������ ���� �ƴϸ�
					throw new Exception(); // ���� �߻�
				}

			} catch (Exception e) {
				System.out.print("�ٽ� �����ϼ��� : ");
			}
		} while (true);

		return menu;

	}

	// �����͸� �Է¹޴� �޼���
	static void inputRecord() {
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println("'�̸�, ��, ��ȣ, �����, �����, ���м���'�� ������ ������� �Է��ϼ���");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�");

		while (true) {
			System.out.print(">>");

			try {
				String input = s.nextLine().trim(); // �Է¹���

				// �Է¹��� ������ Student�ν��Ͻ��� �����ϰ� record�� �߰�
				if (!input.equalsIgnoreCase("q")) {
					// scanner�� �̿��ؼ� ȭ������ ���� �����͸� �Է¹޴´� (','�� �����ڷ�)
					Scanner s2 = new Scanner(input).useDelimiter(",");
					// �Է¹��� ������ Student�ν��Ͻ� �����ϰ� record�� �߰�
					record.add(new Student14(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(),
							s2.nextInt()));
					System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�");
				} else {
					return; // �Է¹��� ���� q �Ǵ� Q�̸� �޼��带 �����ϰ�,
				}
			} catch (Exception e) {
				System.out.println("�Է¿����Դϴ�. �ٽ� �Է��ϼ���");
			}

			// �Է¹��� �����Ϳ��� ���ܰ� �߻��ϸ�, "�Է¿����Դϴ�"�� �����ְ� �ٽ� �Է¹޴´�
			// q �Ǵ� Q�� �Էµɶ����� 2~3�� �۾��� �ݺ��Ѵ�

		}
	}

	// ������ ����� �����ִ� �޼���
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;

		int length = record.size();

		if (length > 0) {
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("===========================================");

			for (int i = 0; i < length; i++) {
				Student14 student = (Student14) record.get(i);
				System.out.print(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}

			System.out.println("===========================================");
			System.out.println(" ���� : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("===========================================");
			System.out.println("               �����Ͱ� �����ϴ�");
			System.out.println("===========================================");
		}
	}
}

class Student14 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int total;
	int schoolRank;
	int classRank;

	Student14(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student14) {
			Student14 tmp = (Student14) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", ����: " + getTotal() + ", ���: "
				+ getAverage() + ", �������: " + schoolRank + ", �ݵ��: " + classRank;
	}

}
