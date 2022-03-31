package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);

		Date inDate = null;

		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���(��: 2015/12/31)");

		// while�� try-catch���� �̿��ؼ� ����ڰ� �ùٸ��������� ��¥�� �Է��Ҷ����� �ݺ��ؼ� �Է¹޵��� ��
		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("��¥�� " + pattern + "�� ���·� �ٽ� �Է����ּ���(��: 2015/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("�Է��Ͻ� ��¥�� ����� " + day + "�ð� ���̰� �ֽ��ϴ�");
	}

}
