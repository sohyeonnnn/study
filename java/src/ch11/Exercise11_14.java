package ch11;

import java.util.ArrayList;
import java.util.Scanner;


class Exercise11_14 {

	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
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
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}

	static int displayMenu() {
		System.out.println("*******************");
		System.out.println("*   성적관리프로그램    *");
		System.out.println("*******************");

		System.out.println();
		System.out.println("1. 학생성적 입력하기");
		System.out.println("2. 학생성적 보기");
		System.out.print("원하는 메뉴를 선택하세요 (1~3) : ");

		// 화면으로부터 메뉴를 입력받는다. 메뉴의 값은 1~3사이의 값
		// 1~3사이의 값을 입력받지않으면, 메뉴의 선택이 잘못되었음을 알려주고 다시 입력받는다

		int menu = 0;

		do {
			try {
				menu = s.nextInt();

				if (menu >= 1 && menu <= 3) {
					break;
				} else {// 1~3사이의 값이 아니면
					throw new Exception(); // 예외 발생
				}

			} catch (Exception e) {
				System.out.print("다시 선택하세요 : ");
			}
		} while (true);

		return menu;

	}

	// 데이터를 입력받는 메서드
	static void inputRecord() {
		System.out.println("1.학생성적 입력하기");
		System.out.println("'이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 공백없이 입력하세요");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다");

		while (true) {
			System.out.print(">>");

			try {
				String input = s.nextLine().trim(); // 입력받음

				// 입력받은 값으로 Student인스턴스를 생성하고 record에 추가
				if (!input.equalsIgnoreCase("q")) {
					// scanner를 이용해서 화면으로 부터 데이터를 입력받는다 (','를 구분자로)
					Scanner s2 = new Scanner(input).useDelimiter(",");
					// 입력받은 값으로 Student인스턴스 생성하고 record에 추가
					record.add(new Student14(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(),
							s2.nextInt()));
					System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다");
				} else {
					return; // 입력받은 값이 q 또는 Q이면 메서드를 종료하고,
				}
			} catch (Exception e) {
				System.out.println("입력오류입니다. 다시 입력하세요");
			}

			// 입력받은 데이터에서 예외가 발생하면, "입력오류입니다"를 보여주고 다시 입력받는다
			// q 또는 Q가 입력될때까지 2~3의 작업을 반복한다

		}
	}

	// 데이터 목록을 보여주는 메서드
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;

		int length = record.size();

		if (length > 0) {
			System.out.println();
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
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
			System.out.println(" 총점 : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("===========================================");
			System.out.println("               데이터가 없습니다");
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
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", 총점: " + getTotal() + ", 평균: "
				+ getAverage() + ", 전교등수: " + schoolRank + ", 반등수: " + classRank;
	}

}
