package ch8;

public class TryWithResourceEx {

	// try-with-resources문의 괄호안에 객체를 생성하는 문장을 넣으면,
	// 이 객체는 따로 close()를 호출하지 않아도 try블럭을 벗어나는 순간 자동적으로 close()가 호출
	// - > 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야 한다

	public static void main(String[] args) {
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // 예외 발생하지않음
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();

		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); //예외 발생
			//exceptionWork()에서 발생한 예외에 대한 내용 출력, close() 출력
			//두 예외가 동시에 발생할 수는 없기 때문에 
			//실제 발생한 예외를 WorkException으로, CloseException은 억제된 예외로 다룬다
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
	}
}

//두개의 try-catch문이 있는데, 첫번째 것은 close()에서만 예외발생
//두번째 것은 exceptionWorl()와 close()에서 모두 예외 발생


class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")가 호출됨");
		if (exception) {
			throw new WorkException("WorkException발생!!");
		}
	}

	public void close() throws CloseException {
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) {
		super(msg);
	}
}

class CloseException extends Exception {
	 CloseException(String msg) {
		super(msg);
	}
}