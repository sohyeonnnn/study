package ch5;

public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch); // A,B,C,D,E ���
		}
		char[] chArr = src.toCharArray(); // String�� char[]�� ��ȯ

		// char�迭�� ���
		System.out.println(chArr);
	}

}
