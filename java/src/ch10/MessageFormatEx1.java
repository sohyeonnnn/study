package ch10;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	// 데이터를 정해진 양식에 맞게 출력할 수 있게 해준다

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "Name:{0} \nTel: {1} \nAge:{2} \nBirthday:{3}";

		Object[] arguments = { "이자바", "02-123-1234", "27", "07-09" };

		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);

	}

}
