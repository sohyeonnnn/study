package ch12;

import java.util.ArrayList;

public class AnnotationEx3 {

	//
	
	
	@SuppressWarnings("deprecation") // deprecation���� ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		nc.oldField = 10; // @deprecated�� ���� ����� ���
		System.out.println(nc.getOldField()); // @deprecated�� ���� ����� ���
		
		@SuppressWarnings("unchecked") //���׸��� ���� ��� ����
		ArrayList<NewClass> list = new ArrayList(); // Ÿ���� �������� ����
		list.add(nc);
		
	}

}
