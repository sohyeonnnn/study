package ch5;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A']; // ���° ���ĺ����� ���ؼ� �迭�� �𽺺�ȣ �߰�
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);

	}

}
