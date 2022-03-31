package ch6;

/////////////////////////연습문제 6-2
class SutdaCard {

	int num;
	boolean isKwang; // 클래스변수

	public SutdaCard() { // 기본 생성자
		/*
		 * this.num = 1; this.isKwang = true;
		 */
		this(1, true); // 한줄로 줄일수있다 - 재사용성 높음, 코드 수정할때 유리
	}

	public SutdaCard(int num, boolean isKwang) { // 매개변수가 있는 생성자
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info() { // 클래스메서드

		if (isKwang) {
			return num + "K";
		} else {
			return num + "";
		}

		// return num + (isKwang ? "K" : ""); // 삼항연산자 사용, 광인 경우 k
	}

}

/////////////////////////연습문제 6-3
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

/////////////////////////연습문제 6-4
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}

	public float getAverage() {
		// return (int) (getTotal() / 3f * 10 + 0.5f) / 10f; // 소수점 둘째자리에서 반올림
		return (Math.round(getTotal() / 3f * 10)) / 10f; // Math.round 사용
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

/////////////////////////연습문제 6-7
class MyPoint {
	int x;
	int y;// 인스턴스변수

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

}

/////////////////////////연습문제 6-21
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

	void volumeUp() { // 최대볼륨보다 작을 때 +1
		if (volume < MAX_VOLUME) {
			volume += 1;
		}
	}

	void volumeDown() { // 최소볼륨보다 클때 -1
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

/////////////////////////연습문제 6-6
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

/////////////////////////연습문제 6-20
	public static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 9); // 몇번째 값과 바꿀지 랜덤 정수 생성
			// arr을 shuffle
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		return arr;
	}

/////////////////////////연습문제 6-22
	public static boolean isNumber(String str) {
		boolean b = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') { // 숫자인지 확인
				b = false;
				return b;
			}
		}

		if (str.equals("") || str.equals(null)) {
			b = false;
		}
		return b;
	}

/////////////////////////연습문제 6-23
	public static int max(int[] arr) {
		int result = 0;
		if (arr == null || arr.length == 0) {
			return -999999;
		}

		for (int i = 0; i < arr.length; i++) { // 가장 큰 값 찾기
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// 큰값을 오른쪽으로 보냄
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		result = arr[arr.length - 1];

		return result;
	}

/////////////////////////연습문제 6-24
	public static int abs(int value) {
		if (value < 0) {
			return -value;
		}
		return value;
	}

	// ------------------------------------- main --------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/////////////////////////연습문제 6-2
		System.out.print("[연습문제6-2] ");
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.print(card1.info() + " / "); // 3
		System.out.println(card2.info()); // 1k - 기본으로 초기화가 1,true로 된다는것을 알수있음

/////////////////////////연습문제 6-4
		System.out.println("[연습문제6-4] ");
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());

/////////////////////////연습문제 6-5
		System.out.println("[연습문제6-5] ");
		s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());

/////////////////////////연습문제 6-6
		System.out.println("[연습문제6-6] ");
		System.out.println(getDistance(1, 1, 2, 2));

/////////////////////////연습문제 6-20
		System.out.println("[연습문제6-20] ");
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("셔플 전:" + java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println("셔플 후:" + java.util.Arrays.toString(result));

/////////////////////////연습문제 6-21
		System.out.println("[연습문제6-21] ");
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

/////////////////////////연습문제 6-22
		System.out.println("[연습문제6-22] ");
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

		str = "1234ㅇ";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

/////////////////////////연습문제 6-23
		System.out.println("[연습문제6-23] ");
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {})); // 크기가 0인 배열

/////////////////////////연습문제 6-24
		System.out.println("[연습문제6-24] ");
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));

	}

}
