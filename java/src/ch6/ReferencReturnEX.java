package ch6;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ReferencReturnEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;

		Data d2 = copy(d);

		System.out.println("d.x=" + d.x);
		System.out.println("d2.x=" + d2.x); // 두 개의 값이 같다

	}

	static Data copy(Data d) { // 객체를 매개변수로 받음
		Data tmp = new Data(); // 새로운 객체 생성
		tmp.x = d.x; // 객체 값 설정

		return tmp; // 객체를 반환-반환타입 참조형 가능
		// 메서드가 객체의 주소를 반환
		// copy메서드가 종료되면서 반환한 tmp의 값은 참조변수 d2에 저장
		// copy가 종료되며 tmp가 사라졌지만 d2로 새로운 객체를 다룰 수 있다
	}

}
