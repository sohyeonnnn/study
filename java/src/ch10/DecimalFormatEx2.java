package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");

		try {
			Number num = df.parse("1.234,567.89");
			System.out.print("1,234,567.89" + " -> ");

			double d = num.doubleValue();
			System.out.print(d + " -> ");

			System.out.println(df2.format(num));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	//Integer.parseInt 메서드는 콤마가 포함된 문자열을 숫자로 변환하지 못한다

}
