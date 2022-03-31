package ch12;

import java.util.ArrayList;

public class AnnotationEx3 {

	//
	
	
	@SuppressWarnings("deprecation") // deprecation관련 경고를 억제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass nc = new NewClass();
		nc.oldField = 10; // @deprecated가 붙은 대상을 사용
		System.out.println(nc.getOldField()); // @deprecated가 붙은 대상을 사용
		
		@SuppressWarnings("unchecked") //지네릭스 관련 경고를 억제
		ArrayList<NewClass> list = new ArrayList(); // 타입을 지정하지 않음
		list.add(nc);
		
	}

}
