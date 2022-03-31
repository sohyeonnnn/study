package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = { 91, 90, 80, 88, 70, 52, 60 };

		ChoiceFormat form = new ChoiceFormat(pattern);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	}

	// 패턴 구분자 #,< ex)limit#value
	// #는 경계값에 범위를 포함, < 경계값에 범위를 포함x
}
