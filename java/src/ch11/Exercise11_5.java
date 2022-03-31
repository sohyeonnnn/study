package ch11;

import java.util.*;

class Student implements Comparable { // Comparable을 구현
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int total; // 총점
	int schoolRank; // 전교등수
	int classRank; // 반등수

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		total = kor + eng + math;
	}

	int getTotal() {
		// return kor + eng + math;
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		if (schoolRank == 0) {
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", 총점: " + getTotal() + ", 평균: "
					+ getAverage();
		}

		// 11-8
		if (classRank == 0) {
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", 총점: " + getTotal() + ", 평균: "
					+ getAverage() + ", 전교등수: " + schoolRank;
		}

		// 11-9
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", 총점: " + getTotal() + ", 평균: "
				+ getAverage() + ", 전교등수: " + schoolRank + ", 반등수: " + classRank;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) { // Student타입인지 확인
			Student s = (Student) o; // 매개변수를 Student타입으로 형변환
			// 11-8 총점 내림차순으로 정렬
			return s.total - total;

			// 11-5 이름으로 오름차순으로 정렬
			// return this.name.compareTo(s.name);
		} else {
			return -1;
		}
	}
}

////////////////////////////////// 11-7
class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;

			// 반 비교 - 반이 같으면
			if (s1.ban - s2.ban == 0) {
				return s1.no - s2.no; // 번호로 비교
			}
			return s1.ban - s2.ban;
		}
		return -1;
	}

}

//////////////////////////////////11-9
class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		// 반과 반등수로 오름차순 정렬
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;

			if (s1.ban == s2.ban) { // 반 같으면
				return s1.classRank - s2.classRank;
			}

			return s1.ban - s2.ban; // 반 오름차순
		}
		return 0;
	}
}

public class Exercise11_5 {

	////////////////////////////////// 11-6
	// 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환하는 메서드
	static int getGroupCount(TreeSet tset, int from, int to) {
		Student s1 = new Student("", 0, 0, from, from, from); // 범위 시작 학생
		Student s2 = new Student("", 0, 0, to, to, to); // 범위 끝 학생

		return tset.subSet(s1, s2).size();
	}

	////////////////////////////////// 11-8
	// 총점을 기준으로 각 학생의 전교등수를 계산하고 전교등수를 기준으로 오름차순 정렬
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬

		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();

		// 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다
		for (int i = 0; i < length; i++) {
			Student s = (Student) list.get(i);
			if (prevTotal == s.total) {
				// 1) 총점이 이전총점과 같으면 이전등수를 등수로 한다
				s.schoolRank = prevRank;
			} else {
				// 2) 총점이 서로 다르면 등수의 값을 계산하여 저장
				// 이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야함
				s.schoolRank = i + 1;
			}
			// 3) 현재 총점과 등수를 이전총점과 이전등수에 저장
			prevTotal = s.total;
			prevRank = s.schoolRank;
		}
	}

	////////////////////////////////// 11-9
	// 반과 반등수로 오름차순 정렬
	public static void calculateClassRank(List list) {
		// 반별 총점 기준 내림차순 정렬
		Collections.sort(list, new ClassTotalComparator());

		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		int classRank = 0;

		// 반복문을 이용하여 list에 저장된 Student객체를 하나씩 읽는다
		for (int i = 0; i < length; i++) {
			
			Student s = (Student) list.get(i);

			if (s.ban != prevBan) {
				// 반이 달라지면 이전등수와 이전총점을 초기화
				prevRank = -1;
				prevTotal = -1;
				// 반 등수도 초기화
				classRank = 0;
			}

			if (s.total == prevTotal) {
				// 총점이 이전총점과 같으면 이전등수를 등수로 한다
				s.classRank = prevRank;
			} else {
				// 총점이 서로 다르면 등수계산하여 저장
				s.classRank = classRank + 1;
			}

			prevBan = s.ban;
			prevRank = s.classRank;
			prevTotal = s.total;
			classRank++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////////////////////////////// 11-5
		System.out.println("[11-5] 이름 오름차순");
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));

		Collections.sort(list);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		///////////////////////////// 11-6
		System.out.println();
		System.out.println("[11-6] 평균 오름차순");
		TreeSet set = new TreeSet(new Comparator() { // 익명클래스
			// 학생들의 평균을 기준으로 정렬
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					return (int) (s1.getAverage() - s2.getAverage());
				}
				return -1;
			}
		});

		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator setIt = set.iterator();

		while (setIt.hasNext()) {
			System.out.println(setIt.next());
		}

		System.out.println("[60~69]:" + getGroupCount(set, 60, 70));
		System.out.println("[70~79]:" + getGroupCount(set, 70, 80));
		System.out.println("[80~89]:" + getGroupCount(set, 80, 90));
		System.out.println("[90~100]:" + getGroupCount(set, 90, 101));

		///////////////////////////// 11-7
		System.out.println();
		System.out.println("[11-7] 반,번호 오름차순");
		ArrayList list7 = new ArrayList();
		list7.add(new Student("이자바", 2, 1, 70, 90, 70));
		list7.add(new Student("안자바", 2, 2, 70, 90, 70));
		list7.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list7.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list7.add(new Student("김자바", 1, 2, 80, 80, 90));

		Collections.sort(list7, new BanNoAscending());

		Iterator it7 = list7.iterator();

		while (it7.hasNext()) {
			System.out.println(it7.next());
		}

		///////////////////////////// 11-8
		System.out.println();
		System.out.println("[11-8] 총점 내림차순");
		ArrayList list8 = new ArrayList();
		list8.add(new Student("이자바", 2, 1, 70, 90, 70));
		list8.add(new Student("안자바", 2, 2, 60, 100, 80));
		list8.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list8.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list8.add(new Student("김자바", 1, 2, 80, 80, 90));

		calculateSchoolRank(list8);
		Iterator it8 = list8.iterator();

		while (it8.hasNext()) {
			System.out.println(it8.next());
		}

		///////////////////////////// 11-9
		System.out.println();
		System.out.println("[11-9] 반,반등수 오름차순");
		calculateClassRank(list8);

		Iterator it9 = list8.iterator();
		while (it9.hasNext()) {
			System.out.println(it9.next());
		}

	}

}
