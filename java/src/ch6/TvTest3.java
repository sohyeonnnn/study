package ch6;

public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
		
		t2=t1; //t1의 주소를 t2에 저장 (t1,t2는 참조변수)
		
		t1.channel = 7; // 채널 변경
		System.out.println("t1의 채널값은 " + t1.channel + "입니다"); // 변경된 값 출력
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
		
		//t1,t2 같은 주소를 가리키기 때문에 채널값 같음
		

	}

}
