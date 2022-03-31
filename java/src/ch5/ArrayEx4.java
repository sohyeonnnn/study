package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 대신 arraycopy()를 사용하면 보다 간단하고 빠르게 배열을 복사할 수 있다
		// for문은 배열의 요소 하나하나에 접근해서 복사하지만, arraycopy는 지정된 범위의 값들을 한 번에 통째로 복사

		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // abc를 result로 복사
		System.arraycopy(num, 0, result, abc.length, num.length); // num를 result로 복사
		System.out.println(result);

		System.arraycopy(abc, 0, num, 0, abc.length);// abc를 num의 첫번째 위치부터 abc의 길이만큼 복사
		System.out.println(num);

		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
