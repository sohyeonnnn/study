package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {

	//ChoiceFormat은 특정 범위에 속하는 값을 문자열로 변환
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] limits = { 60, 70, 80, 90 };
		String[] grades = { "D", "C", "B", "A" };
		int[] scores = { 100, 95, 88, 70, 52, 60, 70 };

		ChoiceFormat form = new ChoiceFormat(limits, grades);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
	}

}
