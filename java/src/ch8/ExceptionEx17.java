package ch8;

//한 메서드에서 발생할 수 있는 예외가 여럿인경우, 몇개는 try-catch문을 통해서 메서드내에서 자체적으로 처리
//그 나머지는 선언부에 지정하여 호출한 메서드에서 처리함
//단 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 처리 가능
//-> 예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해서 가능 : 예외 되던지기(exception re-throwing)

public class ExceptionEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main메서드에서 예외가 처리되었습니다"); // 예외 처리2
		}
	}

	static void method1() throws Exception {
		try {
			throw new Exception(); // 예외 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method1메서드에서 예외가 처리되었습니다"); // 예외 처리1
			throw e; // 예외 발생
		}
	}
}
