package ch10;

import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		date.set(2015, 7, 31); // 2015-08-31

		System.out.println(toString(date));
		System.out.println("= 1ÀÏ ÈÄ =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("= 6´Ş Àü =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		// rollÀº ´Ù¸¥ ÇÊµå¿¡ ¿µÇâÀ» ¹Ì¯µğ ¾Ê´Â´Ù, ´ÙÀ½ ´Ş·Î ³Ñ¾î°¡µµ ¿ù ÇÊµåÀÇ °ªÀº º¯ÇÏÁö ¾Ê°í ÀÏ ÇÊµåÀÇ °ª¸¸ ¹Ù²ï´Ù
		System.out.println("= 31ÀÏ ÈÄ(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println("= 31ÀÏ ÈÄ(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "³â " + (date.get(Calendar.MONTH) + 1) + "¿ù " + date.get(Calendar.DATE) + "ÀÏ";
	}

}
