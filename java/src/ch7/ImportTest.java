
//순서
//1.package문
//2.import문
//3.클래스선언

package ch7;

import java.util.Date;

import java.text.SimpleDateFormat; //import
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// import하지 않으면 클래스앞에 패키지명 적어줘야함
		// java.util.Date today = new java.util.Date();
		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));

	}

}
