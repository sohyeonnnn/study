package ch6;

/////////////////////////�������� 6-2
class SutdaCard {

	int num;
	boolean isKwang; // Ŭ��������

	public SutdaCard() { // �⺻ ������
		/*
		 * this.num = 1; this.isKwang = true;
		 */
		this(1, true); // ���ٷ� ���ϼ��ִ� - ���뼺 ����, �ڵ� �����Ҷ� ����
	}

	public SutdaCard(int num, boolean isKwang) { // �Ű������� �ִ� ������
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info() { // Ŭ�����޼���

		if (isKwang) {
			return num + "K";
		} else {
			return num + "";
		}

		// return num + (isKwang ? "K" : ""); // ���׿����� ���, ���� ��� k
	}

}

/////////////////////////�������� 6-3
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

/////////////////////////�������� 6-4
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}

	public float getAverage() {
		// return (int) (getTotal() / 3f * 10 + 0.5f) / 10f; // �Ҽ��� ��°�ڸ����� �ݿø�
		return (Math.round(getTotal() / 3f * 10)) / 10f; // Math.round ���
	}

	public Student() {
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + ban + "," + kor + "," + eng + "," + eng + "," + math + ","
				+ getTotal() + "," + getAverage();
	}

}

/////////////////////////�������� 6-7
class MyPoint {
	int x;
	int y;// �ν��Ͻ�����

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

}

/////////////////////////�������� 6-21
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() { // t->f , f->t
		isPowerOn = !isPowerOn;
	}

	void volumeUp() { // �ִ뺼������ ���� �� +1
		if (volume < MAX_VOLUME) {
			volume += 1;
		}
	}

	void volumeDown() { // �ּҺ������� Ŭ�� -1
		if (volume > MIN_CHANNEL) {
			volume -= 1;
		}
	}

	void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}

	void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		channel--;
	}

}

public class Example6 {

/////////////////////////�������� 6-6
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

/////////////////////////�������� 6-20
	public static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 9); // ���° ���� �ٲ��� ���� ���� ����
			// arr�� shuffle
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		return arr;
	}

/////////////////////////�������� 6-22
	public static boolean isNumber(String str) {
		boolean b = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') { // �������� Ȯ��
				b = false;
				return b;
			}
		}

		if (str.equals("") || str.equals(null)) {
			b = false;
		}
		return b;
	}

/////////////////////////�������� 6-23
	public static int max(int[] arr) {
		int result = 0;
		if (arr == null || arr.length == 0) {
			return -999999;
		}

		for (int i = 0; i < arr.length; i++) { // ���� ū �� ã��
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// ū���� ���������� ����
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		result = arr[arr.length - 1];

		return result;
	}

/////////////////////////�������� 6-24
	public static int abs(int value) {
		if (value < 0) {
			return -value;
		}
		return value;
	}

	// ------------------------------------- main --------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/////////////////////////�������� 6-2
		System.out.print("[��������6-2] ");
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.print(card1.info() + " / "); // 3
		System.out.println(card2.info()); // 1k - �⺻���� �ʱ�ȭ�� 1,true�� �ȴٴ°��� �˼�����

/////////////////////////�������� 6-4
		System.out.println("[��������6-4] ");
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());

/////////////////////////�������� 6-5
		System.out.println("[��������6-5] ");
		s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		System.out.println(s.info());

/////////////////////////�������� 6-6
		System.out.println("[��������6-6] ");
		System.out.println(getDistance(1, 1, 2, 2));

/////////////////////////�������� 6-20
		System.out.println("[��������6-20] ");
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("���� ��:" + java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println("���� ��:" + java.util.Arrays.toString(result));

/////////////////////////�������� 6-21
		System.out.println("[��������6-21] ");
		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.println("ch: " + t.channel + " / volume: " + t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("ch: " + t.channel + " / volume: " + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("ch: " + t.channel + " / volume: " + t.volume);

/////////////////////////�������� 6-22
		System.out.println("[��������6-22] ");
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));

		str = "1234��";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));

/////////////////////////�������� 6-23
		System.out.println("[��������6-23] ");
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪: " + max(data));
		System.out.println("�ִ밪: " + max(null));
		System.out.println("�ִ밪: " + max(new int[] {})); // ũ�Ⱑ 0�� �迭

/////////////////////////�������� 6-24
		System.out.println("[��������6-24] ");
		int value = 5;
		System.out.println(value + "�� ���밪: " + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪: " + abs(value));

	}

}
