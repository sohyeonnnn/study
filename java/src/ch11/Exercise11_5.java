package ch11;

import java.util.*;

class Student implements Comparable { // Comparable�� ����
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int total; // ����
	int schoolRank; // �������
	int classRank; // �ݵ��

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
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", ����: " + getTotal() + ", ���: "
					+ getAverage();
		}

		// 11-8
		if (classRank == 0) {
			return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", ����: " + getTotal() + ", ���: "
					+ getAverage() + ", �������: " + schoolRank;
		}

		// 11-9
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ", ����: " + getTotal() + ", ���: "
				+ getAverage() + ", �������: " + schoolRank + ", �ݵ��: " + classRank;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) { // StudentŸ������ Ȯ��
			Student s = (Student) o; // �Ű������� StudentŸ������ ����ȯ
			// 11-8 ���� ������������ ����
			return s.total - total;

			// 11-5 �̸����� ������������ ����
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

			// �� �� - ���� ������
			if (s1.ban - s2.ban == 0) {
				return s1.no - s2.no; // ��ȣ�� ��
			}
			return s1.ban - s2.ban;
		}
		return -1;
	}

}

//////////////////////////////////11-9
class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		// �ݰ� �ݵ���� �������� ����
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;

			if (s1.ban == s2.ban) { // �� ������
				return s1.classRank - s2.classRank;
			}

			return s1.ban - s2.ban; // �� ��������
		}
		return 0;
	}
}

public class Exercise11_5 {

	////////////////////////////////// 11-6
	// ��������� ������ �ָ� �ش� ������ ���� �л��� ���� ��ȯ�ϴ� �޼���
	static int getGroupCount(TreeSet tset, int from, int to) {
		Student s1 = new Student("", 0, 0, from, from, from); // ���� ���� �л�
		Student s2 = new Student("", 0, 0, to, to, to); // ���� �� �л�

		return tset.subSet(s1, s2).size();
	}

	////////////////////////////////// 11-8
	// ������ �������� �� �л��� ��������� ����ϰ� ��������� �������� �������� ����
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // ���� list�� �������� ������������ ����

		int prevRank = -1; // ���� �������
		int prevTotal = -1; // ���� ����
		int length = list.size();

		// �ݺ����� �̿��ؼ� list�� ����� Student��ü�� �ϳ��� �д´�
		for (int i = 0; i < length; i++) {
			Student s = (Student) list.get(i);
			if (prevTotal == s.total) {
				// 1) ������ ���������� ������ ��������� ����� �Ѵ�
				s.schoolRank = prevRank;
			} else {
				// 2) ������ ���� �ٸ��� ����� ���� ����Ͽ� ����
				// ������ �����ڿ��ٸ�, �� ���� ����� �������� ���� ����ؾ���
				s.schoolRank = i + 1;
			}
			// 3) ���� ������ ����� ���������� ��������� ����
			prevTotal = s.total;
			prevRank = s.schoolRank;
		}
	}

	////////////////////////////////// 11-9
	// �ݰ� �ݵ���� �������� ����
	public static void calculateClassRank(List list) {
		// �ݺ� ���� ���� �������� ����
		Collections.sort(list, new ClassTotalComparator());

		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		int classRank = 0;

		// �ݺ����� �̿��Ͽ� list�� ����� Student��ü�� �ϳ��� �д´�
		for (int i = 0; i < length; i++) {
			
			Student s = (Student) list.get(i);

			if (s.ban != prevBan) {
				// ���� �޶����� ��������� ���������� �ʱ�ȭ
				prevRank = -1;
				prevTotal = -1;
				// �� ����� �ʱ�ȭ
				classRank = 0;
			}

			if (s.total == prevTotal) {
				// ������ ���������� ������ ��������� ����� �Ѵ�
				s.classRank = prevRank;
			} else {
				// ������ ���� �ٸ��� �������Ͽ� ����
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
		System.out.println("[11-5] �̸� ��������");
		ArrayList list = new ArrayList();
		list.add(new Student("ȫ�浿", 1, 1, 100, 100, 100));
		list.add(new Student("���ü�", 1, 2, 90, 70, 80));
		list.add(new Student("���ڹ�", 1, 3, 80, 80, 90));
		list.add(new Student("���ڹ�", 1, 4, 70, 90, 70));
		list.add(new Student("���ڹ�", 1, 5, 60, 100, 80));

		Collections.sort(list);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		///////////////////////////// 11-6
		System.out.println();
		System.out.println("[11-6] ��� ��������");
		TreeSet set = new TreeSet(new Comparator() { // �͸�Ŭ����
			// �л����� ����� �������� ����
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student) o1;
					Student s2 = (Student) o2;
					return (int) (s1.getAverage() - s2.getAverage());
				}
				return -1;
			}
		});

		set.add(new Student("ȫ�浿", 1, 1, 100, 100, 100));
		set.add(new Student("���ü�", 1, 2, 90, 70, 80));
		set.add(new Student("���ڹ�", 1, 3, 80, 80, 90));
		set.add(new Student("���ڹ�", 1, 4, 70, 90, 70));
		set.add(new Student("���ڹ�", 1, 5, 60, 100, 80));

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
		System.out.println("[11-7] ��,��ȣ ��������");
		ArrayList list7 = new ArrayList();
		list7.add(new Student("���ڹ�", 2, 1, 70, 90, 70));
		list7.add(new Student("���ڹ�", 2, 2, 70, 90, 70));
		list7.add(new Student("ȫ�浿", 1, 3, 100, 100, 100));
		list7.add(new Student("���ü�", 1, 1, 90, 70, 80));
		list7.add(new Student("���ڹ�", 1, 2, 80, 80, 90));

		Collections.sort(list7, new BanNoAscending());

		Iterator it7 = list7.iterator();

		while (it7.hasNext()) {
			System.out.println(it7.next());
		}

		///////////////////////////// 11-8
		System.out.println();
		System.out.println("[11-8] ���� ��������");
		ArrayList list8 = new ArrayList();
		list8.add(new Student("���ڹ�", 2, 1, 70, 90, 70));
		list8.add(new Student("���ڹ�", 2, 2, 60, 100, 80));
		list8.add(new Student("ȫ�浿", 1, 3, 100, 100, 100));
		list8.add(new Student("���ü�", 1, 1, 90, 70, 80));
		list8.add(new Student("���ڹ�", 1, 2, 80, 80, 90));

		calculateSchoolRank(list8);
		Iterator it8 = list8.iterator();

		while (it8.hasNext()) {
			System.out.println(it8.next());
		}

		///////////////////////////// 11-9
		System.out.println();
		System.out.println("[11-9] ��,�ݵ�� ��������");
		calculateClassRank(list8);

		Iterator it9 = list8.iterator();
		while (it9.hasNext()) {
			System.out.println(it9.next());
		}

	}

}
