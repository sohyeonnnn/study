package ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";

		//데이터를 객체배열에 직접 초기화
		// -> 데이터가 바뀔 때마다 매번 배열을 변경해야하고, 다시 컴파일을 해줘야 하므로 불편함
		Object[][] arguments = { { "이자바", "02-123-1234", "27", "07-09" }, { "김프로", "032-333-1234", "33", "10-07" } };

		for (int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
		// ' 홑따옴표는 MessageFormat의 양식에 escape문자로 사용되기 때문에 문자열 msg내에서 홑따옴표를 사용하려면
		// 홑따옴표를 연속으로 두번 사용해야 한다
	}

}
