package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1()은 static메서드이므로 인스턴스 생성없이 직접호출이 가능하다
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다");// 3
	}

	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다");// 1
			return;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다");// 2
			//return문이 실행되는 경우에도 finally블럭의 문장 실행->종료
		}
	}

}
