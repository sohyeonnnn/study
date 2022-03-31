package ch12;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;

	//�ɼǾ��� ���������� ���� �ƹ��� ��� ������
	//-Xlint�ɼ��� �ٿ��� ������ ���� ���� 'varargs'��� �߻�
	//������̼��� �߰��ϸ� ��� ��Ÿ���� ����
	
	@SafeVarargs //�� �޼����� �������ڴ� Ÿ�Ծ������� �ִٴ� ���� �����Ϸ����� �˷��� ��� �߻����� �ʵ��� ��
	@SuppressWarnings("varargs") //�����Ϸ��� Ư�� ���޽����� ��Ÿ�����ʰ� ���ش�
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
