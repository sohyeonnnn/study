package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			// parse�� ����Ͽ� ��¥ �������� ��������� ��ȯ
			Date d = df.parse("2015�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
