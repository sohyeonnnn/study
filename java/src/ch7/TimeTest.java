package ch7;

//abstract : 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상메서드를 선언하는데 사용 - 클래스, 메서드
//미완성이므로 인스턴스 생성 불가
//다른 클래스가 이 클래스를 상속받아서 일부의 원하는 메서드만 오버라이딩 해도 된다는 장점

//접근제어자
//private : 같은 클래스 내에서 접근 가능
//default : 같은 패키지 내에서 접근 가능 (아무런 접근제어자를 붙이지 않는것)
//protected : 같은 패키지 내에서, 다른 패키지의 자손클래스에서 접근 가능
//public : 접근 제한 없음

//접근제어자 사용 이유 : 클래스 내부에 선언된 데이터를 보호하기 위해서, 외부에서 데이터를 함부로 변경하지 못하게 하기 위해 -> 캡슐화
//접근 범위를 최소화하는 것이 좋다 -> 메서드 변경후 오류가 있는지 확인해볼 범위를 좁아짐

//멤버변수를 private,protected로 제한하고, 멤버변수의 값을 읽고 변경할 수 있는 public메서드를 제공하는것이 바람직

class Time {
	private int hour, minute, second; //private:같은 클래스내에서만 접근가능

	Time(int hour, int minute, int second) { //생성자
		setHour(hour); //set메서드 호출
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour; //hour값 반환
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) //값이 조건에 맞지않으면 return
			return;
		this.hour = hour; //매개변수로 받은 값을 hour로 설정
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public String toString() { //문자열로 반환
		return hour + ":" + minute + ":" + second;
	}

}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13; //hour를 private으로 선언했기 때문에 접근할수없다, getter로 가져와야함
		t.setHour(t.getHour() + 1); //t의 hour를 가져와서 1 더한후 set
		System.out.println(t);

	}

}
