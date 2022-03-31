package ch6;

public class TvTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");

		t1.channel = 7; // 채널 변경
		System.out.println("t1의 채널값은 " + t1.channel + "입니다"); // 변경된 값 출력
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");

	}

}
