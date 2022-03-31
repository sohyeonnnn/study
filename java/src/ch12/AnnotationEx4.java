package ch12;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;

	//옵션없이 컴파일했을 때는 아무런 경고가 없지만
	//-Xlint옵션을 붙여서 컴파일 했을 떄는 'varargs'경고가 발생
	//어노테이션을 추가하면 경고 나타나지 않음
	
	@SafeVarargs //이 메서드의 가변인자는 타입안정성이 있다는 것을 컴파일러에게 알려서 경고가 발생하지 않도록 함
	@SuppressWarnings("varargs") //컴파일러의 특정 경고메시지가 나타나지않게 해준다
	MyArrayList(T... arr) {
		this.arr = arr;
	}

	//@SafeVarargs
	//@SuppressWarnings("varargs")
	@SuppressWarnings("unchecked")
	public static <T> MyArrayList<T> asList(T... a) {
		return new MyArrayList<>(a);
	}

	public String toString() {
		return Arrays.toString(arr);
	}
}

public class AnnotationEx4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String> list = MyArrayList.asList("1", "2", "3");

		System.out.println(list);
	}

}
